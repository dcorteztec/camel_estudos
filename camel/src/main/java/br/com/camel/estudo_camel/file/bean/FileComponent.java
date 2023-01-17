package br.com.camel.estudo_camel.file.bean;

import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class FileComponent {

    public void log(File file){
        System.out.println("FileComponent " + file.getName());
    }
}
