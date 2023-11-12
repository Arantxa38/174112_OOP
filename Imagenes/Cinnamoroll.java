package package1;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Cinnamoroll {
	static int width = 1520;
    static int height = 1240;
    
    static Color azul = new Color(36,134,193);
    static Color azulito = new Color(187, 208, 255);
    
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
    	drawHorizontalLine(13, 15, 3, azul);
    	putPixel(8, 3, azul);
    	putPixel(24, 4, azul);
    	putPixel(8, 4, azulito);
    	putPixel(35, 5, azulito);
    	drawVerticalLine(2, 5, 14, azul);
    	drawHorizontalLine(2, 4, 18, azul);
    	drawVerticalLine(17, 20, 3, azul);
    	drawHorizontalLine(31, 33, 18, azul);
    	drawVerticalLine(17, 20, 32, azul);
    	putPixel(3, 21, azulito);
    	putPixel(5, 25, azul);
    	putPixel(31, 26, azul);
    	putPixel(31, 27, azulito);
    	drawHorizontalLine(4, 6, 7, azul);
    	drawHorizontalLine(29, 31, 6, azul);
    	drawHorizontalLine(3, 7, 8, azul);
    	drawHorizontalLine(28, 32, 7, azul);
    	drawHorizontalLine(4, 6, 8, azulito);
    	drawVerticalLine(9, 12, 2, azul);
    	drawVerticalLine(9, 12, 3, azulito);
    	drawHorizontalLine(29, 31, 7, azulito);
    	putPixel(6,9, azulito);
    	putPixel(7,10, azulito);
    	putPixel(7,9, azul);
    	putPixel(3,13, azul);
    	drawHorizontalLine(4, 5, 13, azulito);
    	drawHorizontalLine(4, 5, 14, azul);
    	drawHorizontalLine(6, 11, 14, azulito);
    	drawHorizontalLine(6, 11, 15, azul);
    	drawVerticalLine(16, 19, 10, azul);
    	drawVerticalLine(16, 19, 11, azulito);
    	putPixel(12,15, azulito);
    	drawHorizontalLine(8,9,10, azul);
    	drawHorizontalLine(8,9,11, azulito);
    	drawHorizontalLine(10,13,11, azul);
    	drawHorizontalLine(11,13,12, azulito);
    	putPixel(12,12, azul);
    	drawHorizontalLine(14,16,10, azul);
    	drawHorizontalLine(14,16,11, azulito);
    	drawHorizontalLine(17,22,9, azul);
    	drawHorizontalLine(17,22,10, azulito);
    	drawHorizontalLine(23,26,10, azul);
    	drawHorizontalLine(23,24,11, azulito);
    	putPixel(25,11, azul);
    	putPixel(27,9, azul);
    	putPixel(27,10, azulito);
    	drawVerticalLine(7, 8, 28, azul);
    	drawVerticalLine(7, 8, 29, azulito);
    	putPixel(28,9, azulito);
    	drawVerticalLine(8, 10, 33, azul);
    	drawVerticalLine(8, 10, 32, azulito);
    	putPixel(32,11, azul);
    	drawHorizontalLine(30,31,11, azulito);
    	drawHorizontalLine(30,31,12, azul);
    	drawHorizontalLine(26,29,12, azulito);
    	drawHorizontalLine(26,29,13, azul);
    	putPixel(25,13, azulito);
    	putPixel(26,14, azul);
    	drawVerticalLine(15, 18, 27, azul);
    	drawVerticalLine(17, 18, 26, azulito);
    	drawVerticalLine(19, 22, 25, azulito);
    	drawVerticalLine(19, 22, 26, azul);
    	drawHorizontalLine(24,25,20, azul);
    	drawHorizontalLine(11,15,20, azul);
    	drawHorizontalLine(12,13,20, azulito);
    	drawHorizontalLine(12,26,21, azul);
    	drawHorizontalLine(14,15,21, azulito);
    	drawHorizontalLine(19,20,21, azulito);
    	drawHorizontalLine(24,25,21, azulito);
    	drawHorizontalLine(11,13,22, azul);
    	drawHorizontalLine(16,23,22, azulito);
    	putPixel(14,22, azulito);
    	putPixel(10,23, azul);
    	drawVerticalLine(24,26, 9, azul);
    	drawVerticalLine(24,26, 10, azulito);
    	drawHorizontalLine(11,13,23, azulito);
    	putPixel(14,23, azul);
    	putPixel(15,23, azulito);
    	drawHorizontalLine(11,12,24, azul);
    	drawVerticalLine(24,27, 15, azul);
    	putPixel(14,24, azulito);
    	drawHorizontalLine(11,13,25, azulito);
    	putPixel(11,25, azul);
    	drawHorizontalLine(12,13,26, azul);
    	putPixel(14,25, azul);
    	drawHorizontalLine(10,25,27, azul);
    	drawHorizontalLine(11,14,27, azulito);
    	drawHorizontalLine(17,19,27, azulito);
    	drawHorizontalLine(21,23,27, azulito);
    	drawHorizontalLine(11,14,28, azul);
    	drawVerticalLine(25,26, 16, azulito);
    	drawHorizontalLine(17,23,28, azul);
    	putPixel(20,26, azulito);
    	putPixel(21,26, azul);
    	drawHorizontalLine(19,21,25, azul);
    	drawHorizontalLine(24,25,23, azul);
    	drawHorizontalLine(24,26,25, azul);
    	putPixel(24,24, azulito);
    	putPixel(25,24, azul);
    	putPixel(26,26, azul);
    	drawHorizontalLine(24,25,27, azul);
    	putPixel(25,26, azulito);
    	putPixel(25,26, azulito);
    	putPixel(17,17, azulito);
    	putPixel(19,17, azulito);
    	putPixel(21,17, azulito);
    	putPixel(18,18, azulito);
    	putPixel(20,18, azulito);
    	putPixel(19,19, azulito);
    	putPixel(19,18, Color.pink);
    	drawHorizontalLine(13,14,19, Color.pink);
    	drawHorizontalLine(24,25,18, Color.pink);
    	drawVerticalLine(16,18,14, azul);
    	drawVerticalLine(16,18,15, azul);
    	drawVerticalLine(15,17,23, azul);
    	drawVerticalLine(15,17,24, azul);
    	
        drawSquareGrid(PIXEL_SIZE, Color.black);

        try {       
            ImageIO.write(image, "jpg", new File("Cinnamoroll.jpg"));
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
