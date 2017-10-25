package com.company;

import javax.print.Doc;
import java.util.*;

/**
 * Created by vlusslus on 25.10.2017.
 */

public class Dispatcher implements Runnable{

    private Queue<Document> queue;



    public Dispatcher() {

        Comparator<Document> comparator = new Comparator<Document>() {

            @Override
            public int compare(Document doc1, Document doc2) {
                if(doc1.getId() > doc2.getId()){
                    return 1;
                }
                if(doc1.getId() < doc2.getId()){
                    return -1;
                }
                return 0;
            }
        };

        this.queue = new PriorityQueue<>(100);

        Thread printing = new Thread(this);
        printing.start();


    }

    public void stop() {



    }

    public void accept(Document document) {

        this.queue.add(document);
        System.out.println("Added " + document.getDuration());

    }

    public void remove(Document document) {

    }

    public void run() {

        while(true) {
            if(this.queue.size() > 0) {
                Document executableDoc = this.queue.remove();
                System.out.println("Doc " + executableDoc.getDuration() + " start");
                try{
                    Thread.sleep(executableDoc.getDuration());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Doc " + executableDoc.getDuration() + " finish");
            }
        }

    }

}
