package com.wipro.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/Problem1")
	public ModelAndView problem1() {
		ModelAndView mv = new ModelAndView("Problem1");
		String message = "Hello World!!";
		mv.addObject("message",message);
		return mv;
	}
	
	@RequestMapping("/Problem2")
	public ModelAndView problem2() {
		ModelAndView mv = new ModelAndView("Problem2");
		List<String> movieList = new ArrayList<String>();
		movieList.add("Movie 1");
		movieList.add("Movie 2");
		movieList.add("Movie 3");
		movieList.add("Movie 4");
		movieList.add("Movie 5");
		movieList.add("Movie 6");
		movieList.add("Movie 7");
		movieList.add("Movie 8");
		movieList.add("Movie 9");
		movieList.add("Movie 10");
		mv.addObject("movieList",movieList);
		return mv;
	}
	
	@RequestMapping("/Problem3")
	public ModelAndView problem3(HttpServletRequest req) {
		ModelAndView mv = new ModelAndView("Problem3");
		
		int m1 = Integer.parseInt(req.getParameter("sciencemarks"));
		int m2 = Integer.parseInt(req.getParameter("mathsmarks"));
		int m3 = Integer.parseInt(req.getParameter("englishmarks"));
		int sum = m1+m2+m3;
		//System.out.println("sum is "+sum);
		mv.addObject("marks",sum);
		return mv;
	}
	
	@RequestMapping("/Problem4")
	public ModelAndView problem4() {
		ModelAndView mv = new ModelAndView("Problem4");
		List<String> movieList = new ArrayList<String>();
		movieList.add("Movie 1");
		movieList.add("Movie 2");
		movieList.add("Movie 3");
		movieList.add("Movie 4");
		movieList.add("Movie 5");
		movieList.add("Movie 6");
		movieList.add("Movie 7");
		movieList.add("Movie 8");
		movieList.add("Movie 9");
		movieList.add("Movie 10");
		mv.addObject("movieList",movieList);
		return mv;
	}
}
