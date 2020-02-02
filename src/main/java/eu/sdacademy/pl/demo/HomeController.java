package eu.sdacademy.pl.demo;

import eu.sdacademy.pl.demo.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class HomeController {

    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Sample Test";
    }

    @GetMapping("/home")
    public String homeExampleJspFile(Model model) {

        model.addAttribute("name" ,"Kura Nioska");

        model.addAttribute("project", Project.builder()
        .name("nowy")
        .startDate(new Date())
                .team(5));


        model.addAttribute( "projects" , projectRepository.getProjects());
        return "home";


    }
}


