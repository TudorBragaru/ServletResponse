package rocabee.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;


@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "rocabee")
public class WebConfig implements WebMvcConfigurer {

    private static final String REZOLVER_PREFIX = "/WEB-INF/view/";
    private static final String REZOLVER_SUFIX = ".jsp";

    @Bean
    public ViewResolver viewResolver(){
        UrlBasedViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix(REZOLVER_PREFIX);
        viewResolver.setSuffix(REZOLVER_SUFIX);
        return viewResolver;
    }


//    @Override
//    public void addViewControllers(ViewControllerRegistry registry){
//        registry.addViewController("").setViewName(ViewNames.HOME);
//    }


}
