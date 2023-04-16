/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment5;

/**
 *
 * @author jeyarajjeyakumar
 */
public class MusicThread2 extends Thread {
    @Override
    public void run() {
       
    }
        
    
    public void playReTone() {
        for(int i = 0; i < 50; i++) {
        FilePlayer.play("/Users/jeyarajjeyakumar/Downloads/Multithreading  Resources/Sounds/re.wav"); }
    }
    
    
    
    public void playFaTone() {
        for(int i = 0; i < 50; i++) {
        FilePlayer.play("/Users/jeyarajjeyakumar/Downloads/Multithreading  Resources/Sounds/fa.wav");}
    }
    
    
    
    public void playLaTone() {
        for(int i = 0; i < 50; i++) {
        FilePlayer.play("/Users/jeyarajjeyakumar/Downloads/Multithreading  Resources/Sounds/la.wav");}
    }
   
    
    public void playDoOctaveTone() {
        for(int i = 0; i < 50; i++) {
        FilePlayer.play("/Users/jeyarajjeyakumar/Downloads/Multithreading  Resources/Sounds/do-octave.wav");}
    }
    
}

