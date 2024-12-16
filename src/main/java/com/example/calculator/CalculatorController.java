package com.example.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping()
    public String calculator() {
        return "index";
    }

    @PostMapping()
    public String calculate(@RequestParam double operand1,
                            @RequestParam double operand2,
                            @RequestParam String operator, Model model) {
        double result = 0;
        try {
            result = getResult(operand1, operand2, operator);
        } catch (Exception e) {
            //noinspection CallToPrintStackTrace
            e.printStackTrace();
        }

        if (operand2 == 0.0 && operator.equals("divide")) {
            model.addAttribute("result", "Can not divide by zero");
        } else {
            model.addAttribute("result", result);
        }

        model.addAttribute("operand1", operand1);
        model.addAttribute("operand2", operand2);
        return "index";

    }

    private double getResult(double operand1, double operand2, String operator) {
        switch (operator) {
            case "add":
                return operand1 + operand2;
            case "subtract":
                return operand1 - operand2;
            case "multiply":
                return operand1 * operand2;
            case "divide":
                return operand1 / operand2;
            default:
                return operand1;
        }
    }
}
