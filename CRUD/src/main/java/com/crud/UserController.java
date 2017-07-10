package com.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crud.login.model.LoginModel;
import com.crud.login.service.LoginService;
import com.crud.user.model.UserModel;
import com.crud.user.service.UserService;

/**
 * @author Hardik Shah
 *
 */
@Controller
public class UserController {

	private LoginService loginService;
	private UserService userService;

	@Autowired(required = true)
	@Qualifier(value = "loginService")
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	@Autowired(required = true)
	@Qualifier(value = "userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String landingPage(Model model) {
		model.addAttribute("login", new LoginModel());
		return "login";
	}

	@RequestMapping(value = "/user/login", method = RequestMethod.POST)
	public String loginUser(@ModelAttribute("login") LoginModel p) {
		if (loginService.validateLogin(p)) {
			return "redirect:/home";
		} else {
			return "redirect:/";
		}
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPage(Model model) {
		model.addAttribute("register", new UserModel());
		return "registration";
	}

	@RequestMapping(value = "/user/register", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("register") UserModel userModel) {
		if (userService.registerUser(userModel)) {
			return "redirect:/";
		} else {
			return "redirect:/register";
		}
	}

	@RequestMapping(value = "/home")
	public String homePage(Model model) {
		model.addAttribute("listUsers", userService.listAllUsers());
		return "home";
	}

	@RequestMapping("/user/remove/{id}")
	public String removeUser(@PathVariable("id") int id) {
		userService.removeUser(id);
		return "redirect:/home";
	}

	@RequestMapping("/user/edit/{id}")
	public String editUser(@PathVariable("id") int id, Model model) {
		model.addAttribute("userdetails", userService.getUserById(id));
		return "edit";
	}

	@RequestMapping(value = "/user/update", method = RequestMethod.POST)
	public String updateUser(@ModelAttribute("register") UserModel userModel) {
		userService.updateUser(userModel);
		return "redirect:/home";
	}
}