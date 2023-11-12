package package1;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Kuromi {
	static int width = 1200;
    static int height = 1440;
    
    static Color gorro = new Color(77,80,87);
    
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
    	drawHorizontalLine(6, 8, 2, Color.black);
    	drawHorizontalLine(25, 27, 2, Color.black);
    	drawHorizontalLine(6, 8, 3, Color.black);
    	drawHorizontalLine(25, 27, 3, Color.black);
    	drawHorizontalLine(7, 9, 4, Color.black);
    	drawHorizontalLine(23, 26, 4, Color.black);
    	drawHorizontalLine(7, 10, 5, Color.black);
    	drawHorizontalLine(21, 26, 5, Color.black);
    	drawHorizontalLine(6, 11, 6, Color.black);
    	drawHorizontalLine(20, 26, 6, Color.black);
    	drawHorizontalLine(6, 12, 7, Color.black);
    	drawHorizontalLine(19, 26, 7, Color.black);
    	drawHorizontalLine(6, 12, 8, Color.black);
    	drawHorizontalLine(18, 26, 8, Color.black);
    	drawHorizontalLine(5, 26, 9, Color.black);
    	drawHorizontalLine(5, 26, 10, Color.black);
    	drawHorizontalLine(5, 26, 11, Color.black);
    	drawHorizontalLine(6, 25, 12, Color.black);
    	drawHorizontalLine(7, 24, 13, Color.black);
    	drawHorizontalLine(6, 25, 14, Color.black);
    	drawHorizontalLine(6, 25, 15, Color.black);
    	drawHorizontalLine(5, 25, 16, Color.black);
    	drawHorizontalLine(5, 25, 17, Color.black);
    	drawHorizontalLine(5, 25, 18, Color.black);
    	drawHorizontalLine(5, 24, 19, Color.black);
    	drawHorizontalLine(5, 24, 20, Color.black);
    	drawHorizontalLine(5, 23, 21, Color.black);
    	drawHorizontalLine(6, 22, 22, Color.black);
    	drawHorizontalLine(8, 20, 23, Color.black);
    	drawHorizontalLine(4, 5, 24, Color.black);
    	drawHorizontalLine(7, 19, 24, Color.black);
    	drawHorizontalLine(3, 21, 25, Color.black);
    	drawHorizontalLine(2, 21, 26, Color.black);
    	drawHorizontalLine(2, 22, 27, Color.black);
    	drawHorizontalLine(2, 22, 28, Color.black);
    	drawHorizontalLine(25, 27, 24, Color.black);
    	drawHorizontalLine(25, 27, 25, Color.black);
    	drawHorizontalLine(26, 27, 26, Color.black);
    	drawHorizontalLine(24, 26, 27, Color.black);
    	drawVerticalLine(27,29, 24, Color.black);
    	drawHorizontalLine(3, 9, 29, Color.black);
    	drawHorizontalLine(4, 8, 30, Color.black);
    	drawHorizontalLine(5, 7, 31, Color.black);
    	drawHorizontalLine(11, 21, 32, Color.black);
    	putPixel(6, 32, Color.black);
    	drawHorizontalLine(12, 23, 29, Color.black);
    	drawHorizontalLine(12, 22, 30, Color.black);
    	drawHorizontalLine(11, 21, 31, Color.black);
    	drawHorizontalLine(11, 21, 32, Color.black);
    	drawHorizontalLine(12, 20, 33, Color.black);
    	putPixel(7, 3, gorro);
    	putPixel(26, 3, gorro);
    	putPixel(25, 4, gorro);
    	drawHorizontalLine(8, 9, 5, gorro);
    	drawHorizontalLine(7, 10, 6, gorro);
    	drawHorizontalLine(7, 11, 7, gorro);
    	drawHorizontalLine(7, 11, 8, gorro);
    	drawHorizontalLine(6, 12, 9, gorro);
    	drawHorizontalLine(23, 25, 5, gorro);
    	drawHorizontalLine(21, 25, 6, gorro);
    	drawHorizontalLine(20, 25, 7, gorro);
    	drawHorizontalLine(19, 25, 8, gorro);
    	drawHorizontalLine(19, 25, 9, gorro);
    	drawHorizontalLine(6, 25, 10, gorro);
    	drawHorizontalLine(6, 25, 11, gorro);
    	drawHorizontalLine(8, 22, 12, gorro);
    	putPixel(24,12, gorro);
    	putPixel(10,10, Color.black);
    	putPixel(8,11, Color.black);
    	putPixel(21,11, Color.black);
    	drawHorizontalLine(8, 23, 13, gorro);
    	drawHorizontalLine(7, 24, 14, gorro);
    	drawHorizontalLine(7, 24, 15, gorro);
    	drawHorizontalLine(6, 13, 16, gorro);
    	drawHorizontalLine(18, 24, 16, gorro);
    	drawHorizontalLine(6, 7, 17, gorro);
    	drawHorizontalLine(10, 12, 17, gorro);
    	drawHorizontalLine(19, 24, 17, gorro);
    	putPixel(6,18, gorro);
    	drawHorizontalLine(20, 24, 18, gorro);
    	drawHorizontalLine(21, 23, 19, gorro);
    	drawHorizontalLine(22, 23, 20, gorro);
    	putPixel(22,21, gorro);
    	drawHorizontalLine(10, 12, 13, Color.pink);
    	drawHorizontalLine(9, 13, 14, Color.pink);
    	drawHorizontalLine(9, 13, 15, Color.pink);
    	drawHorizontalLine(10, 12, 16, Color.pink);
    	putPixel(10,15, gorro);
    	putPixel(12,15, gorro);
    	drawHorizontalLine(15, 17, 17, Color.white);
    	drawHorizontalLine(8, 9, 18, Color.white);
    	drawHorizontalLine(13, 18, 18, Color.white);
    	drawHorizontalLine(7, 19, 19, Color.white);
    	drawHorizontalLine(7, 20, 20, Color.white);
    	drawHorizontalLine(7, 20, 21, Color.white);
    	drawHorizontalLine(8, 19, 22, Color.white);
    	putPixel(13,24, Color.white);
    	putPixel(18,24, Color.white);
    	putPixel(9,24, Color.red);
    	putPixel(22,24, Color.red);
    	putPixel(11,24, gorro);
    	drawHorizontalLine(15, 16, 24, gorro);
    	drawHorizontalLine(20,21, 24, gorro);
    	drawHorizontalLine(10, 14, 25, Color.white);
    	drawHorizontalLine(18, 19, 25, Color.white);
    	drawHorizontalLine(10, 15, 26, Color.white);
    	drawHorizontalLine(17, 20, 26, Color.white);
    	drawHorizontalLine(11, 21, 27, Color.white);
    	drawHorizontalLine(13, 21, 28, Color.white);
    	drawHorizontalLine(13, 20, 29, Color.white);
    	drawHorizontalLine(13, 21, 30, Color.white);
    	drawHorizontalLine(12, 20, 31, Color.white);
    	drawHorizontalLine(12, 20, 32, Color.white);
    	putPixel(16,25, gorro);
    	putPixel(16,27, Color.red);
    	putPixel(17,32, Color.black);
    	drawHorizontalLine(9, 10, 20, Color.black);
    	drawHorizontalLine(9, 10, 21, Color.black);
    	drawHorizontalLine(15, 16, 20, Color.black);
    	drawHorizontalLine(15, 16, 21, Color.black);
    	putPixel(8,19, Color.black);
    	putPixel(17,19, Color.black);
    	putPixel(8,21, Color.pink);
    	putPixel(12,21, Color.pink);
    	putPixel(17,21, Color.pink);
    	drawHorizontalLine(4, 5, 25, Color.pink);
    	drawHorizontalLine(7, 8, 25, Color.pink);
    	drawHorizontalLine(3, 5, 26, Color.pink);
    	drawHorizontalLine(7, 8, 26, Color.pink);
    	drawHorizontalLine(3, 8, 27, Color.pink);
    	drawHorizontalLine(3, 9, 28, Color.pink);
    	drawHorizontalLine(4, 8, 29, Color.pink);
    	drawHorizontalLine(5, 7, 30, Color.pink);
    	putPixel(6,31, Color.pink);
    	drawVerticalLine(26,27, 4, Color.white);
    	
    	
    	
    	
    	//putPixel(35, 5, Color.black);
    	//drawVerticalLine(2, 5, 14, gorro);
    	//drawHorizontalLine(2, 4, 18, gorro);
  
    	
        drawSquareGrid(PIXEL_SIZE, Color.black);

        try {       
            ImageIO.write(image, "jpg", new File("Kuromi.jpg"));
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