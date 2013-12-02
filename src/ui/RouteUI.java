/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui;

import domain.Knooppunt;
import domain.Route;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 *
 * @author johan
 */
public class RouteUI {
    
    private Route r;
    
    RouteUI(Route r){
        this.r=r;
    }
            
    
    public void drawRoute(Graphics g){
        Graphics2D routeUI = (Graphics2D) g ;
        //routeUI.setBackground(Color.WHITE);
       
        for(Knooppunt eenKnooppunt : this.r){
            routeUI.setColor(Color.BLUE);
            routeUI.fillRect(eenKnooppunt.kol * 20, eenKnooppunt.rij * 20 , 20, 20);
        }
        
    }
    
}