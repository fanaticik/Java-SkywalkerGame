package com.realtusgml.neon.framework;

import com.realtutsgml.neon.window.BufferedImageLoader;

import java.awt.image.BufferedImage;



       public class Texture {
           SpriteSheet bs ,ps;

    private BufferedImage block_sheet=null;
    private BufferedImage player_sheet =null;

    public BufferedImage[] block =new BufferedImage[2];
    public BufferedImage[] player = new BufferedImage[14];
    public BufferedImage[] player_jump = new BufferedImage[6];



      public Texture(){

          BufferedImageLoader loader =new BufferedImageLoader();
          try {
              block_sheet = loader.loadImage("/block_sheet.png");
              player_sheet = loader.loadImage("/player_sheet.png");

          }catch (Exception e){

              e.printStackTrace();
          }
           bs = new SpriteSheet(block_sheet);
           ps = new SpriteSheet(player_sheet);

          getTextures();

    }
    private void getTextures(){
        block[0]=bs.grabImage(1,1,32,32); //ice block
        block[1]=bs.grabImage(2,1,32,32);//emerald block


        //looking right
        player[0] = ps.grabImage(1,1,32,64);//idle frame for player
        player[1] = ps.grabImage(2,1,32,64);//walking animation for player
        player[2] = ps.grabImage(3,1,32,64);//walking animation for player
        player[3] = ps.grabImage(4,1,32,64);//walking animation for player
        player[4] = ps.grabImage(5,1,32,64);//walking animation for player
        player[5] = ps.grabImage(6,1,32,64);//walking animation for player
        player[6] = ps.grabImage(7,1,32,64);//walking animation for player


        //looking left
        player[7] = ps.grabImage(20,1,32,64);//idle frame for player
        player[8] = ps.grabImage(19,1,32,64);//walking animation for player
        player[9] = ps.grabImage(18,1,32,64);//walking animation for player
        player[10] = ps.grabImage(17,1,32,64);//walking animation for player
        player[11] = ps.grabImage(16,1,32,64);//walking animation for player
        player[12] = ps.grabImage(15,1,32,64);//walking animation for player
        player[13] = ps.grabImage(14,1,32,64);//walking animation for player

        player_jump[0]=ps.grabImage(8,2,32,64);
        player_jump[1]=ps.grabImage(9,2,32,64);
        player_jump[2]=ps.grabImage(10,2,32,64);
        player_jump[3]=ps.grabImage(11,2,32,64);
        player_jump[4]=ps.grabImage(12,2,32,64);
        player_jump[5]=ps.grabImage(13,2,32,64);
    }
}
