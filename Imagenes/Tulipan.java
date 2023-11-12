package package1;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Tulipan {
	static int width = 1080;
    static int height = 1080;
    
    static Color rosa = new Color(252,123,135);
    static Color rosa2 = new Color(254,168,193);
    static Color melon = new Color(253,195,175);
    static Color melon2 = new Color(252,224,175);
    static Color verde = new Color(170, 213, 118);
    static Color verde2 = new Color(115, 169, 66);
    static Color verde3 = new Color(83, 141, 34);
    static Color luz = new Color(207, 225, 185);
    
    static Graphics2D g;

    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

    private final static int PIXEL_SIZE = 40;
    private final static Color[][] PIXELS = {
        {Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE},
        {Color.WHITE, Color.BLUE, Color.BLUE, Color.BLUE, Color.WHITE},
        {Color.WHITE, Color.BLUE, Color.RED, Color.BLUE, Color.WHITE},
        {Color.WHITE, Color.BLUE, Color.BLUE, Color.BLUE, Color.WHITE},
        {Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE}
    };
    
    public static void paint() {
    	drawBackground(PIXEL_SIZE, Color.white); 
    	drawHorizontalLine(10, 13, 2, rosa);
    	drawHorizontalLine(9, 14, 3, rosa);
    	drawHorizontalLine(7, 15, 4, rosa);
    	drawHorizontalLine(6, 16, 5, rosa);
    	drawHorizontalLine(5, 16, 6, rosa);
    	drawHorizontalLine(5, 16, 7, rosa);
    	drawHorizontalLine(5, 16, 8, rosa);
    	drawHorizontalLine(5, 16, 9, rosa);
    	drawHorizontalLine(6, 16, 10, rosa);
    	drawHorizontalLine(7, 15, 11, rosa);
    	drawHorizontalLine(8, 14, 12, rosa);
    	drawHorizontalLine(9, 12, 13, rosa);
    	drawHorizontalLine(18, 20, 5, Color.pink);
    	drawHorizontalLine(1, 3, 11, Color.pink);
    	drawHorizontalLine(22, 24, 8, Color.pink);
    	drawHorizontalLine(3, 5, 17, Color.pink);
    	drawVerticalLine(4, 6, 19, Color.pink);
    	drawVerticalLine(7, 9, 23, Color.pink);
    	drawVerticalLine(10, 12, 2, Color.pink);
    	drawVerticalLine(16, 18, 4, Color.pink);
    	drawVerticalLine(13, 14, 13, verde2);
    	drawVerticalLine(13, 14, 14, verde3);
    	drawHorizontalLine(10, 13, 3, rosa2);
    	drawHorizontalLine(9, 12, 4, rosa2);
    	drawHorizontalLine(10, 11, 5, rosa2);
    	putPixel(7, 5, rosa2);
    	drawVerticalLine(6, 8, 6, rosa2);
    	drawVerticalLine(5, 7, 15, rosa2);
    	drawVerticalLine(4, 8, 14, rosa2);
    	drawVerticalLine(5, 8, 13, rosa2);
    	putPixel(12, 6, rosa2);
    	drawHorizontalLine(8, 9, 6, rosa2);
    	drawHorizontalLine(8, 11, 7, rosa2);
    	drawHorizontalLine(8, 11, 8, rosa2);
    	drawHorizontalLine(8, 12, 9, melon);
    	drawHorizontalLine(9, 10, 9, rosa2);
    	drawVerticalLine(8, 9, 15, melon);
    	drawVerticalLine(9, 10, 14, melon);
    	putPixel(6, 9, melon);
    	drawHorizontalLine(7, 11, 10, melon);
    	drawHorizontalLine(9, 10, 11, melon);
    	putPixel(8, 11, melon2);
    	putPixel(15, 10, melon2);
    	putPixel(14, 11, melon2);
    	putPixel(12, 10, melon2);
    	drawHorizontalLine(11, 12, 11, melon2);
    	drawHorizontalLine(9, 12, 12, melon2);
    	drawHorizontalLine(6, 9, 14, verde2);
    	drawVerticalLine(15, 21, 14, verde2);
    	drawVerticalLine(15,17,15, verde3);
    	drawVerticalLine(22, 23, 14, verde3);
    	drawHorizontalLine(6, 10, 15, verde2);
    	drawHorizontalLine(7, 11, 16, verde2);
    	drawHorizontalLine(8, 12, 17, verde2);
    	drawHorizontalLine(8, 13, 18, verde2);
    	drawHorizontalLine(8, 13, 19, verde2);
    	drawHorizontalLine(9, 13, 20, verde2);
    	drawHorizontalLine(10, 13, 21, verde2);
    	drawHorizontalLine(11, 13, 22, verde2);
    	putPixel(12, 23, verde2);
    	putPixel(13, 23, verde3);
    	putPixel(20, 11, verde2);
    	drawHorizontalLine(13, 14, 23, verde3);
    	drawHorizontalLine(12, 13, 24, verde3);
    	drawHorizontalLine(19, 21, 12, verde2);
    	drawHorizontalLine(18, 20, 13, verde2);
    	drawHorizontalLine(17, 20, 14, verde2);
    	drawHorizontalLine(16, 19, 15, verde2);
    	drawHorizontalLine(16, 19, 16, verde2);
    	drawHorizontalLine(16, 19, 17, verde2);
    	drawHorizontalLine(15, 19, 18, verde2);
    	drawHorizontalLine(15, 18, 19, verde2);
    	drawHorizontalLine(15, 18, 20, verde2);
    	drawHorizontalLine(15, 17, 21, verde2);
    	drawHorizontalLine(7, 9, 15, luz);
    	drawHorizontalLine(8, 10, 16, luz);
    	drawVerticalLine(17, 18, 9, luz);
    	putPixel(9, 16, verde);
    	drawHorizontalLine(10, 11, 17, verde);
    	drawHorizontalLine(10, 12, 18, verde);
    	drawHorizontalLine(9, 13, 19, verde);
    	drawHorizontalLine(10, 13, 20, verde);
    	drawHorizontalLine(11, 12, 21, verde);
    	putPixel(12,22, verde);
    	putPixel(20,12, luz);
    	putPixel(17,15, luz);
    	putPixel(19,13, luz);
    	putPixel(18,16,luz);
    	putPixel(11,19, verde2);
    	putPixel(12,20, verde2);
    	putPixel(13,21, verde3);
    	drawHorizontalLine(18, 19, 14, luz);
    	drawVerticalLine(16, 20, 17, verde);
    	drawVerticalLine(17,18,18,verde);
    	drawVerticalLine(17, 20, 16, verde);
    	drawVerticalLine(18, 19, 15, verde);
    	putPixel(16,19, verde2);
    	putPixel(15,20, verde3);
    	
    	
    	
    	//putPixel(35, 5, Color.black);
    	//drawVerticalLine(2, 5, 14, rosa);
    	//drawHorizontalLine(2, 4, 18, rosa);
  
    	
        drawSquareGrid(PIXEL_SIZE, Color.black);

        try {       
            ImageIO.write(image, "jpg", new File("Tulipan.jpg"));
            System.out.println("EXITO !!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void drawVerticalLine(int a, int b, int x, Color c){
    	for(int i=a;i<=b;i++){
     	   g.setColor(c);
           g.fillRect(x * PIXEL_SIZE, i * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
        }
    }
    
    private static void drawHorizontalLine(int a, int b, int y, Color c){
        for(int i=a;i<=b;i++){
     	   g.setColor(c);
           g.fillRect(i * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
        }
    }
    
    private static void putPixel(int x, int y, Color c){       
	   g.setColor(c);
	   g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);    
    }
    
    private static void fillRect(int x, int y, int width, int height, Color c){
    	g.setColor(c);
    	g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, width*PIXEL_SIZE, height*PIXEL_SIZE);
    }
    
    private static void drawSquareGrid(int size, Color c) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {                
                g.setColor(c);
                g.drawRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
            }
        }
    }
    private static void drawBackground(int size, Color c) {
    	for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                g.setColor(c);
                g.fillRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);                
            }
        }
    }
    
    
    public static void main(String[] args) {
        g = image.createGraphics();        
        paint();
    }
}