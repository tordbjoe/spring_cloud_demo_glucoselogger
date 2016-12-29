package no.tordbjorn.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RefreshScope
public class GlucoseLoggerController {
	
	@Value("${appname}")
	private String appname;
	
	@Value("${low}")
	private float low;
	
	@Value("${mid}")
	private float mid;
	
	@Value("${max}")
	private float max;
	
	@RequestMapping("/tresholds")
	public String showTresholds(Model m) {
		m.addAttribute("appname",appname);
		m.addAttribute("low", low);
		m.addAttribute("mid", mid);
		m.addAttribute("max", max);
		
		return "tresholdview";
	}
	
}
