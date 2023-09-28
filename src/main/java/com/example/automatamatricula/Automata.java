package com.example.automatamatricula;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Automata {

    private  String matricula;



    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public String automata(String Matricula){
        String [] mat = Matricula.split("");
        matricula = "q0";
        String ruta = matricula;
        for(String matri: mat){
            switch(matricula){
                case "q0":
                    switch(matri){
                        case "V":
                            matricula = "q1";
                            ruta.concat("->q1");
                            break;
                        case "W":
                            matricula = "q2";
                            break;

                    }
                    break;
                case "q1":
                    switch(matri){
                        case "T":
                            matricula = "q3";

                            break;
                        case "U":
                            matricula = "q3";
                            break;
                        case "V":
                            matricula = "q3";
                            break;
                        case "W":
                            matricula = "q3";
                            break;
                        case "X":
                            matricula = "q3";
                            break;
                        case "Y":
                            matricula = "q3";
                            break;
                        case "Z":
                            matricula = "q3";
                            break;

                    }
                    break;
                case"q2":
                    switch(matri){
                        case "A":
                            matricula = "q3";
                            break;
                        case "B":
                            matricula = "q3";
                            break;
                        case "C":
                            matricula = "q3";
                            break;
                        case "D":
                            matricula = "q3";
                            break;
                        case "E":
                            matricula = "q3";
                            break;
                        case "F":
                            matricula = "q3";
                            break;
                        case "G":
                            matricula = "q3";
                            break;
                        case "H":
                            matricula = "q3";
                            break;
                        case "I":
                            matricula = "q3";
                            break;
                        case "J":
                            matricula = "q3";
                            break;
                        case "K":
                            matricula = "q3";
                            break;


                    }
                    break;
                case "q3":
                    switch(matri){
                        case "A":
                            matricula = "q4";
                            break;
                        case "B":
                            matricula = "q4";
                            break;
                        case "C":
                            matricula = "q4";
                            break;
                        case "D":
                            matricula = "q4";
                            break;
                        case "E":
                            matricula = "q4";
                            break;
                        case "F":
                            matricula = "q4";
                            break;
                        case "G":
                            matricula = "q4";
                            break;
                        case "H":
                            matricula = "q4";
                            break;
                        case "I":
                            matricula = "q4";
                            break;
                        case "J":
                            matricula = "q4";
                            break;
                        case "K":
                            matricula = "q4";
                            break;
                        case "L":
                            matricula = "q4";
                            break;
                        case "M":
                            matricula = "q4";
                            break;
                        case "N":
                            matricula = "q4";
                            break;
                        case "O":
                            matricula = "q4";
                            break;
                        case "P":
                            matricula = "q4";
                            break;
                        case "Q":
                            matricula = "q4";
                            break;
                        case "R":
                            matricula = "q4";
                            break;
                        case "S":
                            matricula = "q4";
                            break;
                        case "T":
                            matricula = "q4";
                            break;
                        case "U":
                            matricula = "q4";
                            break;
                        case "V":
                            matricula = "q4";
                            break;
                        case "W":
                            matricula = "q4";
                            break;
                        case "X":
                            matricula = "q4";
                            break;
                        case "Y":
                            matricula = "q4";
                            break;
                        case "Z":
                            matricula = "q4";
                            break;

                    }
                    break;
                case "q4":
                    switch(matri){
                        case "-":
                            matricula="q5";
                            break;

                    }
                    break;
                case "q5":
                    switch(matri){
                        case "0":
                            matricula = "q11";
                            break;
                        case "1":
                            matricula = "q6";
                            break;
                        case "2":
                            matricula = "q6";
                            break;
                        case "3":
                            matricula = "q6";
                            break;
                        case "4":
                            matricula = "q6";
                            break;
                        case "5":
                            matricula = "q6";
                            break;
                        case "6":
                            matricula = "q6";
                            break;
                        case "7":
                            matricula = "q6";
                            break;
                        case "8":
                            matricula = "q6";
                            break;
                        case "9":
                            matricula = "q6";
                            break;

                    }
                    break;
                case "q6":
                    switch(matri){
                        case "0":
                            matricula = "q12";
                            break;
                        case "1":
                            matricula = "q7";
                            break;
                        case "2":
                            matricula = "q7";
                            break;
                        case "3":
                            matricula = "q7";
                            break;
                        case "4":
                            matricula = "q7";
                            break;
                        case "5":
                            matricula = "q7";
                            break;
                        case "6":
                            matricula = "q7";
                            break;
                        case "7":
                            matricula = "q7";
                            break;
                        case "8":
                            matricula = "q7";
                            break;
                        case "9":
                            matricula = "q7";
                            break;

                    }
                    break;
                case "q7":
                    switch(matri){
                        case "0":
                            matricula = "q16";
                            break;
                        case "1":
                            matricula = "q8";
                            break;
                        case "2":
                            matricula = "q8";
                            break;
                        case "3":
                            matricula = "q8";
                            break;
                        case "4":
                            matricula = "q8";
                            break;
                        case "5":
                            matricula = "q8";
                            break;
                        case "6":
                            matricula = "q8";
                            break;
                        case "7":
                            matricula = "q8";
                            break;
                        case "8":
                            matricula = "q8";
                            break;
                        case "9":
                            matricula = "q8";
                            break;

                    }
                    break;
                case "q8":
                    switch(matri){
                        case "-":
                            matricula = "q9";
                            break;

                    }
                    break;
                case "q9":
                    switch(matri){
                        case "A":
                            matricula = "q17";
                            break;
                        case "B":
                            matricula = "q17";
                            break;
                        case "C":
                            matricula = "q17";
                            break;
                        case "D":
                            matricula = "q17";
                            break;
                        case "E":
                            matricula = "q17";
                            break;
                        case "F":
                            matricula = "q17";
                            break;
                        case "G":
                            matricula = "q17";
                            break;
                        case "H":
                            matricula = "q17";
                            break;
                        case "I":
                            matricula = "q17";
                            break;
                        case "J":
                            matricula = "q17";
                            break;
                        case "K":
                            matricula = "q17";
                            break;
                        case "L":
                            matricula = "q17";
                            break;
                        case "M":
                            matricula = "q17";
                            break;
                        case "N":
                            matricula = "q17";
                            break;
                        case "O":
                            matricula = "q17";
                            break;
                        case "P":
                            matricula = "q17";
                            break;
                        case "Q":
                            matricula = "q17";
                            break;
                        case "R":
                            matricula = "q17";
                            break;
                        case "S":
                            matricula = "q17";
                            break;
                        case "T":
                            matricula = "q17";
                            break;
                        case "U":
                            matricula = "q17";
                            break;
                        case "V":
                            matricula = "q17";
                            break;
                        case "W":
                            matricula = "q17";
                            break;
                        case "X":
                            matricula = "q17";
                            break;
                        case "Y":
                            matricula = "q17";
                            break;
                        case "Z":
                            matricula = "q17";
                            break;

                    }
                    break;
                case "q11":
                    switch(matri){
                        case "0":
                            matricula = "q13";
                            break;
                        case "1":
                            matricula = "q7";
                            break;
                        case "2":
                            matricula = "q7";
                            break;
                        case "3":
                            matricula = "q7";
                            break;
                        case "4":
                            matricula = "q7";
                            break;
                        case "5":
                            matricula = "q7";
                            break;
                        case "6":
                            matricula = "q7";
                            break;
                        case "7":
                            matricula = "q7";
                            break;
                        case "8":
                            matricula = "q7";
                            break;
                        case "9":
                            matricula = "q7";
                            break;

                    }
                    break;
                case "q12":
                    switch(matri){
                        case "0":
                            matricula = "q15";
                            break;
                        case "1":
                            matricula = "q17";
                            break;
                        case "2":
                            matricula = "q17";
                            break;
                        case "3":
                            matricula = "q17";
                            break;
                        case "4":
                            matricula = "q17";
                            break;
                        case "5":
                            matricula = "q17";
                            break;
                        case "6":
                            matricula = "q17";
                            break;
                        case "7":
                            matricula = "q17";
                            break;
                        case "8":
                            matricula = "q17";
                            break;
                        case "9":
                            matricula = "q17";
                            break;
                    }
                    break;
                case "q13":
                    switch(matri){
                        case "0":
                            matricula = "q14";
                            break;
                        case "1":
                            matricula = "q8";
                            break;
                        case "2":
                            matricula = "q8";
                            break;
                        case "3":
                            matricula = "q8";
                            break;
                        case "4":
                            matricula = "q8";
                            break;
                        case "5":
                            matricula = "q8";
                            break;
                        case "6":
                            matricula = "q8";
                            break;
                        case "7":
                            matricula = "q8";
                            break;
                        case "8":
                            matricula = "q8";
                            break;
                        case "9":
                            matricula = "q8";
                            break;

                    }
                    break;
                case "q14":
                    switch(matri){
                        case "-":
                            matricula = "q9";
                            break;

                    }
                    break;
                case "q15":
                    switch(matri){
                        case "-":
                            matricula = "q9";
                            break;

                    }
                    break;
                case "q16":
                    switch(matri){
                        case "-":
                            matricula = "q9";
                            break;

                    }
                    break;
                case "q10":
                    switch(matri){
                        case "-":
                            matricula = "q9";
                            break;

                    }
                    break;
                case "q17":
                    matricula = "q10";
                    break;
            }
        }
        if ( matricula == "q17"){
            return "cadena acepada";
        }else{
            return"no aceptada";
        }
    }


}
