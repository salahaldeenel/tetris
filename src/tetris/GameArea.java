
package tetris;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class GameArea extends JPanel  {
    private int gridRows;
    private int gridColumns;
    private int gridCellSize;
    
   private int [][] block = {{1,0},{1,0},{1,1}};
   public GameArea(JPanel Placeholder,int columns){
       Placeholder.setVisible(false);
      this.setBounds(Placeholder.getBounds());
      this.setBackground(Placeholder.getBackground());
      this.setBorder(Placeholder.getBorder());
      gridColumns=columns;
      gridCellSize=this.getBounds().width/gridColumns;
      gridRows=this.getBounds().height/gridCellSize;
   }
   
   public void drawBlock(Graphics g){
       for (int i =0 ;i<block.length;i++){
           for(int j=0;j<block[0].length;j++){
               if(block[i][j]==1){
                   g.setColor(Color.red);
                   g.fillRect(j*gridCellSize, i*gridCellSize, gridCellSize, gridCellSize);
                   g.setColor(Color.black);
                     g.drawRect(j*gridCellSize, i*gridCellSize, gridCellSize, gridCellSize);
               }
           }
       }
   }
    @Override
    public void paintComponent(Graphics g) {
         super.paintComponent(g);
         for(int j =0 ; j<gridRows;j++)
         for(int i =0;i<gridColumns;i++){
             g.drawRect(i*gridCellSize, j*gridCellSize, gridCellSize, gridCellSize);
         }
         drawBlock(g);
    }
  
}
