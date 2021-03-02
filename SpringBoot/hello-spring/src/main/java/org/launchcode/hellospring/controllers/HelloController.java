package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@Controller
@RequestMapping("hello")
public class HelloController {
    // Handles request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello Spring!";
//    }

    //lives at /hello/goodbye
    @GetMapping("goodbye")
        public String goodbye() {
        return "Goodbye Spring!";
    }

    // lives at /hello/hello
    //Handles request of the form /hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value="hello")
    public String helloWithQueryParam(@RequestParam String name, @RequestParam String language) {
        String properGreeting = HelloController.createMessage(name, language);
        return "<h3 style='color:blue;'>" + properGreeting + "</h3>";

    }

    // Handles request of the form /hello/LaunchCode
    @GetMapping("hello/{name}")
    public String helloWithQueryParam2(@PathVariable String name) { return "Hello " + name + "!";}

    // lives at /hello/form
    @GetMapping("form")
        public String helloForm() {
        return  "<html>"+
                "<body>"+
                "<form action='hello' method='post'>"+ //submit a request to /hello
                "<input type ='text' name='name' />"+
                "<select name='language'>" +
                    "<option value='English'>English</option>" +
                    "<option value='Spanish'>Spanish</option>" +
                    "<option value='French'>French</option>" +
                    "<option value='Italian'>Italian</option>"+
                    "<option value='German'>German</option>"+
                "</select>"+
                "<input type ='submit' value='Greet me!' />" +
                "</form>"+
                "</html>";
}
public static String createMessage(String name, String language) {
        switch(language) {

            case"Spanish":
                return" Hola, "+ name;
            case"French":
                return" Bonjour, "+ name;
            case"Italian":
                return" Ciao, "+ name;
            case"German":
                return" Hallo, "+ name;
            default:
                return "Hello, "+ name;

        }
}
}

