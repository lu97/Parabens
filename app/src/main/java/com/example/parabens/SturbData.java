package com.example.parabens;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class SturbData {
        public static List<Element> fillList(){
            List<Element> elementList = new LinkedList<>();
            elementList.add(new Element("Карбонад натрия","Описание описание", false, new Date(2013, 5, 11)));
            elementList.add(new Element("Sodium Laureth Sulfate","Описание описание", true, new Date(2015, 12, 31)));
            elementList.add(new Element("Оксид кремния","Описание описание", false,new Date(2020, 01, 25)  ));
            elementList.add(new Element("Ammonium Laureth Sulfate","Описание описание", false  ));
            elementList.add(new Element("Ammonium Lauryl Sulfate","Описание описание", false  ));
            elementList.add(new Element("Sodium coco-sulfate","Описание описание", true ));
            elementList.add(new Element("Бетаин (Cocamidopropyl Betaine)","Описание описание", true ));
            elementList.add(new Element("Сульфобетаин (Сocamidopropyl sulfobetaine)","Описание описание", false  ));
            elementList.add(new Element("Glythereth Cocoate","Описание описание", false  ));
            elementList.add(new Element("Магнезиум лаурилсульфат","Описание описание", false  ));
            elementList.add(new Element("Sodium sulfosuccinate","Описание описание" , true));
            elementList.add(new Element("Карбонад натрия","Описание описание" , false ));
            elementList.add(new Element("Sodium Laureth Sulfate","Описание описание", true ));
            elementList.add(new Element("Оксид кремния","Описание описание", false  ));
            elementList.add(new Element("Ammonium Laureth Sulfate","Описание описание", false  ));
            elementList.add(new Element("Ammonium Lauryl Sulfate","Описание описание", false  ));
            elementList.add(new Element("Sodium coco-sulfate","Описание описание", false  ));
            elementList.add(new Element("Бетаин (Cocamidopropyl Betaine)","Описание описание" ));
            elementList.add(new Element("Сульфобетаин (Сocamidopropyl sulfobetaine)","Описание описание" ));
            elementList.add(new Element("Glythereth Cocoate","Описание описание" ));
            elementList.add(new Element("Магнезиум лаурилсульфат","Описание описание" ));
            elementList.add(new Element("Sodium sulfosuccinate","Описание описание" ));
            return elementList;
        }

    }
