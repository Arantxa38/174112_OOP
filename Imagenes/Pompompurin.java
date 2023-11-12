package package1;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Pompompurin {
	static int width = 1240;
    static int height = 1280;
    
    static Color cuerpo = new Color(235,200,136);
    static Color popo = new Color(145,99,77);
    static Color azul = new Color(36,134,193);
    static Color sombra = new Color(167,84,138);
    static Color crema = new Color(241,220,215);
    static Color gorro = new Color(155,108,91);
    
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
    	drawHorizontalLine(20, 22, 2, popo);
    	drawHorizontalLine(24, 26, 2, popo);
    	drawHorizontalLine(18, 28, 4, popo);
    	drawHorizontalLine(19, 27, 3, popo);
    	drawHorizontalLine(18, 28, 5, popo);
    	drawHorizontalLine(18, 28, 6, popo);
    	drawHorizontalLine(18, 28, 7, popo);
    	drawHorizontalLine(19, 27, 8, popo);
    	drawHorizontalLine(20, 26, 9, popo);
    	drawHorizontalLine(21, 25, 10, popo);
    	drawVerticalLine(11, 14, 23, popo);
    	putPixel(13,8, popo);
    	drawHorizontalLine(11, 15, 9, popo);
    	drawHorizontalLine(9, 17, 10, popo);
    	drawHorizontalLine(7, 19, 11, popo);
    	drawHorizontalLine(6, 20, 12, popo);
    	drawHorizontalLine(5, 21, 13, popo);
    	drawHorizontalLine(3, 23, 14, popo);
    	drawHorizontalLine(2, 24, 15, popo);
    	drawHorizontalLine(2, 24, 16, popo);
    	drawHorizontalLine(2, 24, 17, popo);
    	drawHorizontalLine(3, 23, 18, popo);
    	drawHorizontalLine(5, 23, 19, popo);
    	drawHorizontalLine(6, 22, 20, popo);
    	drawHorizontalLine(5, 22, 21, popo);
    	drawHorizontalLine(4, 21, 22, popo);
    	drawHorizontalLine(5, 20, 23, popo);
    	drawHorizontalLine(6, 20, 24, popo);
    	drawHorizontalLine(6, 20, 25, popo);
    	drawHorizontalLine(6, 20, 26, popo);
    	drawHorizontalLine(7, 19, 27, popo);
    	drawHorizontalLine(7, 19, 28, popo);
    	drawHorizontalLine(8, 10, 29, popo);
    	drawHorizontalLine(16, 18, 29, popo);
    	drawHorizontalLine(21, 22, 3, Color.pink);
    	drawHorizontalLine(24, 25, 3, Color.pink);
    	drawHorizontalLine(20, 27, 4, Color.pink);
    	drawHorizontalLine(20, 27, 5, Color.pink);
    	drawHorizontalLine(20, 27, 6, Color.pink);
    	drawHorizontalLine(20, 27, 7, Color.pink);
    	drawHorizontalLine(22, 26, 8, Color.pink);
    	drawHorizontalLine(23, 25, 9, Color.pink);
    	putPixel(20,3, sombra);
    	drawVerticalLine(3, 6, 26, crema);
    	drawVerticalLine(4, 7, 19, sombra);
    	putPixel(25,7, crema);
    	drawHorizontalLine(19, 20, 7, sombra);
    	drawHorizontalLine(20, 21, 8, sombra);
    	drawHorizontalLine(21, 22, 9, sombra);
    	putPixel(23,10, sombra);
    	drawHorizontalLine(11, 15, 10, gorro);
    	drawHorizontalLine(10, 16, 11, gorro);
    	drawHorizontalLine(7, 9, 12, cuerpo);
    	drawHorizontalLine(17, 19, 12, cuerpo);
    	drawHorizontalLine(6, 20, 13, cuerpo);
    	drawHorizontalLine(5, 6, 14, cuerpo);
    	drawHorizontalLine(8, 18, 14, cuerpo);
    	drawHorizontalLine(20, 21, 14, cuerpo);
    	drawHorizontalLine(3, 5, 15, cuerpo);
    	drawHorizontalLine(3, 5, 16, cuerpo);
    	drawHorizontalLine(3, 4, 17, cuerpo);
    	drawHorizontalLine(21, 23, 15, cuerpo);
    	drawHorizontalLine(21, 23, 16, cuerpo);
    	drawHorizontalLine(22, 23, 17, cuerpo);
    	drawHorizontalLine(7, 19, 15, cuerpo);
    	drawHorizontalLine(7, 19, 16, cuerpo);
    	drawHorizontalLine(6, 20, 17, cuerpo);
    	drawHorizontalLine(6, 20, 18, cuerpo);
    	drawHorizontalLine(6, 20, 19, cuerpo);
    	drawHorizontalLine(9, 17, 20, cuerpo);
    	drawHorizontalLine(6, 21, 21, cuerpo);
    	drawHorizontalLine(5, 20, 22, cuerpo);
    	drawHorizontalLine(7, 19, 23, cuerpo);
    	drawHorizontalLine(7, 19, 24, cuerpo);
    	drawHorizontalLine(7, 19, 25, cuerpo);
    	drawHorizontalLine(7, 19, 26, cuerpo);
    	drawHorizontalLine(8, 18, 27, cuerpo);
    	drawHorizontalLine(8, 10, 28, cuerpo);
    	drawHorizontalLine(16, 18, 28, cuerpo);
    	putPixel(8,20, azul);
    	putPixel(18,20, azul);
    	drawHorizontalLine(7, 19, 21, azul);
    	drawHorizontalLine(8, 18, 22, azul);
    	drawHorizontalLine(10, 12, 23, azul);
    	drawHorizontalLine(10, 12, 24, azul);
    	drawHorizontalLine(10, 12, 25, azul);
    	drawVerticalLine(16, 19, 13, popo);
    	putPixel(9,16, popo);
    	putPixel(17,16, popo);
    	putPixel(11,17, popo);
    	putPixel(12,18, popo);
    	putPixel(14,18, popo);
    	putPixel(15,17, popo);
    	putPixel(13,18, Color.pink);
    	
    	
        drawSquareGrid(PIXEL_SIZE, Color.black);

        try {       
            ImageIO.write(image, "jpg", new File("Pompompurin.jpg"));
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