/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ecole.Forms;

import com.codename1.components.ImageViewer;
import static com.codename1.io.Log.p;
import com.codename1.ui.Button;
import com.codename1.ui.EncodedImage;
import com.codename1.ui.FontImage;
import static com.codename1.ui.FontImage.MATERIAL_ARCHIVE;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.URLImage;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;

/**
 *
 * @author Hamma
 */
public class Home extends Form{
    
     private Resources theme1; 
     public Home() {
         
       
         
        super("Logistique Home", BoxLayout.y());
        
        
        Button btnAddChauffeur = new Button("Ajouter Chauffeur");
        Button btnChauffeurList = new Button(" llste des Chauffeurs ");
        
        btnAddChauffeur.addActionListener((evt) -> {
            new CategoriesForm().show();
        });
        
        this.getToolbar().addMaterialCommandToSideMenu(" Ajouter Chauffeur ", FontImage.MATERIAL_GROUP_ADD, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                
                
                  new CategoriesForm().show();
               
            }
            
        });
          theme1 = UIManager.initFirstTheme("/theme");
          EncodedImage enco = EncodedImage.createFromImage(theme1.getImage("b.jpg"), false);
        
        Image im =URLImage.createToStorage(enco,"image", "imag.png"); 
        
        ImageViewer imv = new ImageViewer(im);
         add(imv);
   }
}
