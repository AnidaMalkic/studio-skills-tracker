package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.naming.Name;

@Controller
public class SkillsController {
    @RequestMapping("")
    @ResponseBody
    public String skills() {
        return
                "<h1> Skills Tracker </h1>" +
                        "<h2> We have a few things we would like you to learn.Here is the list!</h2>" +
                        "<ol>" +
                        "<li>Java</li>" +
                        "<li>Javascript</li>" +
                        "<li>Python</li>" +

                        "</ol>";
    }

    @GetMapping("/skillsForm")
    @ResponseBody
    public String skillsForm() {

        return
                        "<html>" +  "<body>" +
                "<form method = 'post'>" +
        "<label> Name <input type='text' name = 'name' /</label><br>" +
        "<label> My first skill " + "<br/>" +
        "<select name = 'firstSkill' id = 'firstSkill'>" +
        "<option value='java'>Java</option>" +
        "<option value='javascript'>JavaScript</option>" +
        "<option value='python'>Python</option>" +
                 "</select></label><br>" +

       "<label> My second skill " + "<br/>" +
       "<select name = 'secondSkill' id = 'secondSkill'>" +
       "<option value='java'>Java</option>" +
       "<option value='javascript'>JavaScript</option>" +
       "<option value='python'>Python</option>" +
                 "</select></label><br>" +

       "<label> My third skill " + "<br/>" +
       "<select name = thirdSkill id = 'thirdSkill'>" +
       "<option value='java'>Java</option>" +
       "<option value='javascript'>JavaScript</option>" +
       "<option value='python'>Python</option>" +
                 "</select></label><br>" +
                 "<input type = 'submit' value = 'Submit!'>" +
                 "</body>" + "</html>";

    }

    @PostMapping("/skillsForm")
    @GetMapping("/skillsForm")
    @ResponseBody
    public String inputSkills (@RequestParam String name,
                               @RequestParam String firstSkill,
                               @RequestParam String secondSkill,
                               @RequestParam String thirdSkill) {

        return  "<h1>" + name + "</h1>" +
                        "<ol>" +
                        "<li>" + firstSkill + "</li>" +
                        "<li>" + secondSkill + "</li>" +
                        "<li>" + thirdSkill + "</li>" +
                        "</ol>";

    }
}
