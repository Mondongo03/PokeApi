package com.example.consumingrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping(MoveController.MOVE)
public class MoveController {
    public static  final  String MOVE = "/movimiento";

    @Autowired
    Service service;

    @GetMapping
    public String getMoveQuote(Model model){
        ArrayList<MoveQuote> moves = service.getMoveQuote();
        model.addAttribute("move", moves);

        return  "move";
    }
}
