package com.example.automatamatricula;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
//Q0-Q17; en mi diagrama termina en q10 pero debe terminar el q17
import java.util.ArrayList;

public class Automata {

    private  String matricula;
    private String ruta;



    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }



    public String automata(String Matricula){
        String [] mat = Matricula.split("");
        ArrayList<String> ruta = new ArrayList<>();
        matricula = "q0";
        ruta.add("->q0");
        for(String matri: mat){
            switch(matricula){
                case "q0":
                    switch(matri){
                        case "V":
                            matricula = "q1";
                            ruta.add("->q1");
                            break;
                        case "W":
                            matricula = "q2";
                            ruta.add("->q2");
                            break;

                    }
                    break;
                case "q1":
                    switch(matri){
                        case "T":
                            matricula = "q3";
                            ruta.add("->q3");

                            break;
                        case "U":
                            matricula = "q3";
                            ruta.add("->q3");
                            break;
                        case "V":
                            matricula = "q3";
                            ruta.add("->q3");
                            break;
                        case "W":
                            matricula = "q3";
                            ruta.add("->q3");
                            break;
                        case "X":
                            matricula = "q3";
                            ruta.add("->q3");
                            break;
                        case "Y":
                            matricula = "q3";
                            ruta.add("->q3");
                            break;
                        case "Z":
                            matricula = "q3";
                            ruta.add("->q3");
                            break;

                    }
                    break;
                case"q2":
                    switch(matri){
                        case "A":
                            matricula = "q3";
                            ruta.add("->q3");
                            break;
                        case "B":
                            matricula = "q3";
                            ruta.add("->q3");
                            break;
                        case "C":
                            matricula = "q3";
                            ruta.add("->q3");
                            break;
                        case "D":
                            matricula = "q3";
                            ruta.add("->q3");
                            break;
                        case "E":
                            matricula = "q3";
                            ruta.add("->q3");
                            break;
                        case "F":
                            matricula = "q3";
                            ruta.add("->q3");
                            break;
                        case "G":
                            matricula = "q3";
                            ruta.add("->q3");
                            break;
                        case "H":
                            matricula = "q3";
                            ruta.add("->q3");
                            break;
                        case "I":
                            matricula = "q3";
                            ruta.add("->q3");
                            break;
                        case "J":
                            matricula = "q3";
                            ruta.add("->q3");
                            break;
                        case "K":
                            matricula = "q3";
                            ruta.add("->q3");
                            break;


                    }
                    break;
                case "q3":
                    switch(matri){
                        case "A":
                            matricula = "q4";
                            ruta.add("->q4");
                            break;
                        case "B":
                            matricula = "q4";
                            ruta.add("->q4");
                            break;
                        case "C":
                            matricula = "q4";
                            ruta.add("->q4");
                            break;
                        case "D":
                            matricula = "q4";
                            ruta.add("->q4");
                            break;
                        case "E":
                            matricula = "q4";
                            ruta.add("->q4");
                            break;
                        case "F":
                            matricula = "q4";
                            ruta.add("->q4");
                            break;
                        case "G":
                            matricula = "q4";
                            ruta.add("->q4");
                            break;
                        case "H":
                            matricula = "q4";
                            ruta.add("->q4");
                            break;
                        case "I":
                            matricula = "q4";
                            ruta.add("->q4");
                            break;
                        case "J":
                            matricula = "q4";
                            ruta.add("->q4");
                            break;
                        case "K":
                            matricula = "q4";
                            ruta.add("->q4");
                            break;
                        case "L":
                            matricula = "q4";
                            ruta.add("->q4");
                            break;
                        case "M":
                            matricula = "q4";
                            ruta.add("->q4");
                            break;
                        case "N":
                            matricula = "q4";
                            ruta.add("->q4");
                            break;
                        case "O":
                            matricula = "q4";
                            ruta.add("->q4");
                            break;
                        case "P":
                            matricula = "q4";
                            ruta.add("->q4");
                            break;
                        case "Q":
                            matricula = "q4";
                            ruta.add("->q4");
                            break;
                        case "R":
                            matricula = "q4";
                            ruta.add("->q4");
                            break;
                        case "S":
                            matricula = "q4";
                            ruta.add("->q4");
                            break;
                        case "T":
                            matricula = "q4";
                            ruta.add("->q4");
                            break;
                        case "U":
                            matricula = "q4";
                            ruta.add("->q4");
                            break;
                        case "V":
                            matricula = "q4";
                            ruta.add("->q4");
                            break;
                        case "W":
                            matricula = "q4";
                            ruta.add("->q4");
                            break;
                        case "X":
                            matricula = "q4";
                            ruta.add("->q4");
                            break;
                        case "Y":
                            matricula = "q4";
                            ruta.add("->q4");
                            break;
                        case "Z":
                            matricula = "q4";
                            ruta.add("->q4");
                            break;

                    }
                    break;
                case "q4":
                    switch(matri){
                        case "-":
                            matricula="q5";
                            ruta.add("->q5");
                            break;

                    }
                    break;
                case "q5":
                    switch(matri){
                        case "0":
                            matricula = "q11";
                            ruta.add("->q11");
                            break;
                        case "1":
                            matricula = "q6";
                            ruta.add("->q6");
                            break;
                        case "2":
                            matricula = "q6";
                            ruta.add("->q6");
                            break;
                        case "3":
                            matricula = "q6";
                            ruta.add("->q6");
                            break;
                        case "4":
                            matricula = "q6";
                            ruta.add("->q6");
                            break;
                        case "5":
                            matricula = "q6";
                            ruta.add("->q6");
                            break;
                        case "6":
                            matricula = "q6";
                            ruta.add("->q6");
                            break;
                        case "7":
                            matricula = "q6";
                            ruta.add("->q6");
                            break;
                        case "8":
                            matricula = "q6";
                            ruta.add("->q6");
                            break;
                        case "9":
                            matricula = "q6";
                            ruta.add("->q6");
                            break;

                    }
                    break;
                case "q6":
                    switch(matri){
                        case "0":
                            matricula = "q12";
                            ruta.add("->q12");
                            break;
                        case "1":
                            matricula = "q7";
                            ruta.add("->q7");
                            break;
                        case "2":
                            matricula = "q7";
                            ruta.add("->q7");
                            break;
                        case "3":
                            matricula = "q7";
                            ruta.add("->q7");
                            break;
                        case "4":
                            matricula = "q7";
                            ruta.add("->q7");
                            break;
                        case "5":
                            matricula = "q7";
                            ruta.add("->q7");
                            break;
                        case "6":
                            matricula = "q7";
                            ruta.add("->q7");
                            break;
                        case "7":
                            matricula = "q7";
                            ruta.add("->q7");
                            break;
                        case "8":
                            matricula = "q7";
                            ruta.add("->q7");
                            break;
                        case "9":
                            matricula = "q7";
                            ruta.add("->q7");
                            break;

                    }
                    break;
                case "q7":
                    switch(matri){
                        case "0":
                            matricula = "q16";
                            ruta.add("->q16");
                            break;
                        case "1":
                            matricula = "q8";
                            ruta.add("->q8");
                            break;
                        case "2":
                            matricula = "q8";
                            ruta.add("->q8");
                            break;
                        case "3":
                            matricula = "q8";
                            ruta.add("->q8");
                            break;
                        case "4":
                            matricula = "q8";
                            ruta.add("->q8");
                            break;
                        case "5":
                            matricula = "q8";
                            ruta.add("->q8");
                            break;
                        case "6":
                            matricula = "q8";
                            ruta.add("->q8");
                            break;
                        case "7":
                            matricula = "q8";
                            ruta.add("->q8");
                            break;
                        case "8":
                            matricula = "q8";
                            ruta.add("->q8");
                            break;
                        case "9":
                            matricula = "q8";
                            ruta.add("->q8");
                            break;

                    }
                    break;
                case "q8":
                    switch(matri){
                        case "-":
                            matricula = "q9";
                            ruta.add("->q9");
                            break;

                    }
                    break;
                case "q9":
                    switch(matri){
                        case "A":
                            matricula = "q17";
                            ruta.add("->q17");
                            break;
                        case "B":
                            matricula = "q17";
                            ruta.add("->q17");
                            break;
                        case "C":
                            matricula = "q17";
                            ruta.add("->q17");
                            break;
                        case "D":
                            matricula = "q17";
                            ruta.add("->q17");
                            break;
                        case "E":
                            matricula = "q17";
                            ruta.add("->q17");
                            break;
                        case "F":
                            matricula = "q17";
                            ruta.add("->q17");
                            break;
                        case "G":
                            matricula = "q17";
                            ruta.add("->q17");
                            break;
                        case "H":
                            matricula = "q17";
                            ruta.add("->q17");
                            break;
                        case "I":
                            matricula = "q17";
                            ruta.add("->q17");
                            break;
                        case "J":
                            matricula = "q17";
                            ruta.add("->q17");
                            break;
                        case "K":
                            matricula = "q17";
                            ruta.add("->q17");
                            break;
                        case "L":
                            matricula = "q17";
                            ruta.add("->q17");
                            break;
                        case "M":
                            matricula = "q17";
                            ruta.add("->q17");
                            break;
                        case "N":
                            matricula = "q17";
                            ruta.add("->q17");
                            break;
                        case "O":
                            matricula = "q17";
                            ruta.add("->q17");
                            break;
                        case "P":
                            matricula = "q17";
                            ruta.add("->q17");
                            break;
                        case "Q":
                            matricula = "q17";
                            ruta.add("->q17");
                            break;
                        case "R":
                            matricula = "q17";
                            ruta.add("->q17");
                            break;
                        case "S":
                            matricula = "q17";
                            ruta.add("->q17");
                            break;
                        case "T":
                            matricula = "q17";
                            ruta.add("->q17");
                            break;
                        case "U":
                            matricula = "q17";
                            ruta.add("->q17");
                            break;
                        case "V":
                            matricula = "q17";
                            ruta.add("->q17");
                            break;
                        case "W":
                            matricula = "q17";
                            ruta.add("->q17");
                            break;
                        case "X":
                            matricula = "q17";
                            ruta.add("->q17");
                            break;
                        case "Y":
                            matricula = "q17";
                            ruta.add("->q17");
                            break;
                        case "Z":
                            matricula = "q17";
                            ruta.add("->q17");
                            break;

                    }
                    break;
                case "q11":
                    switch(matri){
                        case "0":
                            matricula = "q13";
                            ruta.add("->q13");
                            break;
                        case "1":
                            matricula = "q7";
                            ruta.add("->q7");
                            break;
                        case "2":
                            matricula = "q7";
                            ruta.add("->q7");
                            break;
                        case "3":
                            matricula = "q7";
                            ruta.add("->q7");
                            break;
                        case "4":
                            matricula = "q7";
                            ruta.add("->q7");
                            break;
                        case "5":
                            matricula = "q7";
                            ruta.add("->q7");
                            break;
                        case "6":
                            matricula = "q7";
                            ruta.add("->q7");
                            break;
                        case "7":
                            matricula = "q7";
                            ruta.add("->q7");
                            break;
                        case "8":
                            matricula = "q7";
                            ruta.add("->q7");
                            break;
                        case "9":
                            matricula = "q7";
                            ruta.add("->q7");
                            break;

                    }
                    break;
                case "q12":
                    switch(matri){
                        case "0":
                            matricula = "q15";
                            ruta.add("->q15");
                            break;
                        case "1":
                            matricula = "q10";
                            ruta.add("->q10");
                            break;
                        case "2":
                            matricula = "q10";
                            ruta.add("->q10");
                            break;
                        case "3":
                            matricula = "q10";
                            ruta.add("->q10");
                            break;
                        case "4":
                            matricula = "q10";
                            ruta.add("->q10");
                            break;
                        case "5":
                            matricula = "q10";
                            ruta.add("->q10");
                            break;
                        case "6":
                            matricula = "q10";
                            ruta.add("->q10");
                            break;
                        case "7":
                            matricula = "q10";
                            ruta.add("->q10");
                            break;
                        case "8":
                            matricula = "q10";
                            ruta.add("->q10");
                            break;
                        case "9":
                            matricula = "q10";
                            ruta.add("->q10");
                            break;
                    }
                    break;
                case "q13":
                    switch(matri){
                        case "0":
                            matricula = "q14";
                            ruta.add("->q10");
                            break;
                        case "1":
                            matricula = "q8";
                            ruta.add("->q8");
                            break;
                        case "2":
                            matricula = "q8";
                            ruta.add("->q8");
                            break;
                        case "3":
                            matricula = "q8";
                            ruta.add("->q8");
                            break;
                        case "4":
                            matricula = "q8";
                            ruta.add("->q8");
                            break;
                        case "5":
                            matricula = "q8";
                            ruta.add("->q8");
                            break;
                        case "6":
                            matricula = "q8";
                            ruta.add("->q8");
                            break;
                        case "7":
                            matricula = "q8";
                            ruta.add("->q8");
                            break;
                        case "8":
                            matricula = "q8";
                            ruta.add("->q8");
                            break;
                        case "9":
                            matricula = "q8";
                            ruta.add("->q8");
                            break;

                    }
                    break;
                case "q14":
                    switch(matri){
                        case "-":
                            matricula = "q9";
                            ruta.add("->q8");
                            break;

                    }
                    break;
                case "q15":
                    switch(matri){
                        case "-":
                            matricula = "q9";
                            ruta.add("->q9");
                            break;

                    }
                    break;
                case "q16":
                    switch(matri){
                        case "-":
                            matricula = "q9";
                            ruta.add("->q9");
                            break;

                    }
                    break;
                case "q10":
                    switch(matri){
                        case "-":
                            matricula = "q9";
                            ruta.add("->q9");
                            break;

                    }
                    break;
                case "q17":
                    matricula = "q17";
                    ruta.add("->q17");
                    break;
            }
        }
        if ( matricula == "q17"){
            return "MATRÍCULA ACEPTADA\n" + String.join(" ", ruta);
        }else{
            return"MATRÍCULA NO ACEPTADA\n" + String.join(" ", ruta);
        }
    }


}
