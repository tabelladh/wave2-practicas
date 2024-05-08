package com.example.MorseYRomanos.Service;

import org.springframework.stereotype.Service;

@Service
public class NumRomanos implements INumRomanos{
    @Override
    public String transformarARomanos(Integer numDecimal) {
        String romano = "";
        while (numDecimal > 0) {
            if (numDecimal >= 1000) {
                romano = romano + "M";
                numDecimal = numDecimal - 1000;
            } else if (numDecimal >= 900) {
                romano = romano + "CM";
                numDecimal = numDecimal - 900;
            } else if (numDecimal >= 500) {
                romano = romano + "D";
                numDecimal = numDecimal - 500;
            } else if (numDecimal >= 400) {
                romano = romano + "CD";
                numDecimal = numDecimal - 400;
            } else if (numDecimal >= 100) {
                romano = romano + "C";
                numDecimal = numDecimal - 100;
            } else if (numDecimal >= 90) {
                romano = romano + "XC";
            } else if (numDecimal >= 50) {
                romano = romano + "L";
                numDecimal = numDecimal - 50;
            } else if (numDecimal >= 40) {
                romano = romano + "XL";
                numDecimal = numDecimal - 40;
            }   else if (numDecimal >= 10) {
                romano = romano + "X";
                numDecimal = numDecimal - 10;
            } else if (numDecimal >= 9) {
                romano = romano + "IX";
            }   else if (numDecimal >= 5) {
                romano = romano + "V";
                numDecimal = numDecimal - 5;
            }   else if (numDecimal >= 4) {
                romano = romano + "IV";
                numDecimal = numDecimal - 4;
            }   else if (numDecimal >= 1) {
                romano = romano + "I";
                numDecimal = numDecimal - 1;
            }

        }
        return romano;
    }
    }

