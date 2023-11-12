package package1;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;



public class MyMelody {
    static int width = 1040;
    static int height = 1280;
    
    static Color rosa = new Color(255, 0, 110);
    static Color moño = new Color(58, 134, 255);
    
    static Graphics2D g;

    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    // Definimos el tamaño del pixel y la matriz de colores
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
        drawHorizontalLine(5, 9, 1, Color.black);
        drawHorizontalLine(18, 21, 1, Color.black);
        drawHorizontalLine(17, 22, 2, Color.black);
        drawHorizontalLine(4, 10, 2, Color.black);
        drawHorizontalLine(16, 23, 3, Color.black);
        drawHorizontalLine(3, 11, 3, Color.black);
        drawHorizontalLine(15, 23, 4, Color.black);
        drawHorizontalLine(2, 11, 4, Color.black);
        drawHorizontalLine(2, 11, 5, Color.black);
        drawHorizontalLine(2, 11, 6, Color.black);
        drawHorizontalLine(3, 11, 7, Color.black);
        drawHorizontalLine(14, 23, 5, Color.black);
        drawHorizontalLine(14, 22, 6, Color.black);
        drawHorizontalLine(13, 21, 7, Color.black);
        drawHorizontalLine(4, 19, 8, Color.black);
        drawHorizontalLine(3, 18, 9, Color.black);
        drawHorizontalLine(2, 18, 10, Color.black);
        drawHorizontalLine(2, 19, 11, Color.black);
        drawHorizontalLine(2, 20, 12, Color.black);
        drawHorizontalLine(3, 21, 13, Color.black);
        drawHorizontalLine(2, 21, 14, Color.black);
        drawHorizontalLine(2, 21, 15, Color.black);
        drawHorizontalLine(2, 21, 16, Color.black);
        drawHorizontalLine(2, 21, 17, Color.black);
        drawHorizontalLine(2, 21, 18, Color.black);
        drawHorizontalLine(3, 20, 19, Color.black);
        drawHorizontalLine(4, 19, 20, Color.black);
        drawHorizontalLine(5, 18, 21, Color.black);
        drawHorizontalLine(5, 18, 22, Color.black);
        drawHorizontalLine(4, 19, 23, Color.black);
        drawHorizontalLine(3, 20, 24, Color.black);
        drawHorizontalLine(3, 20, 25, Color.black);
        drawHorizontalLine(4, 19, 26, Color.black);
        drawHorizontalLine(6, 17, 27, Color.black);
        drawHorizontalLine(6, 17, 28, Color.black);
        drawHorizontalLine(7, 9, 29, Color.black);
        drawHorizontalLine(14, 16, 29, Color.black);
        drawHorizontalLine(5, 9, 2, rosa);
        drawHorizontalLine(18, 21, 2, rosa);
        drawHorizontalLine(17, 22, 3, rosa);
        drawHorizontalLine(4, 10, 3, rosa);
        drawHorizontalLine(16, 22, 4, rosa);
        drawHorizontalLine(3, 10, 4, rosa);
        drawHorizontalLine(3, 10, 5, rosa);
        drawHorizontalLine(3, 10, 6, rosa);
        drawHorizontalLine(15, 22, 5, rosa);
        drawHorizontalLine(15, 21, 6, rosa);
        putPixel(9, 5, Color.black);
        putPixel(8, 6, Color.black);
        putPixel(10, 7, rosa);
        drawHorizontalLine(14, 19, 7, rosa);
        drawHorizontalLine(14, 18, 8, rosa);
        drawHorizontalLine(11, 17, 9, rosa);
        drawHorizontalLine(11, 17, 10, rosa);
        drawHorizontalLine(10, 18, 11, rosa);
        drawHorizontalLine(7, 19, 12, rosa);
        drawHorizontalLine(6, 7, 13, rosa);
        drawHorizontalLine(16, 20, 13, rosa);
        drawHorizontalLine(3, 6, 14, rosa);
        drawHorizontalLine(3, 5, 15, rosa);
        drawHorizontalLine(3, 4, 16, rosa);
        drawHorizontalLine(3, 4, 17, rosa);
        drawHorizontalLine(3, 4, 18, rosa);
        drawHorizontalLine(17, 20, 14, rosa);
        drawHorizontalLine(18, 20, 15, rosa);
        drawHorizontalLine(19, 20, 16, rosa);
        drawHorizontalLine(19, 20, 17, rosa);
        drawHorizontalLine(19, 20, 18, rosa);
        putPixel(4, 19, rosa);
        putPixel(5, 20, rosa);
        putPixel(19, 19, rosa);
        putPixel(18, 20, rosa);
        drawHorizontalLine(6, 9, 22, rosa);
        drawHorizontalLine(14, 17, 22, rosa);
        drawHorizontalLine(7, 8, 23, rosa);
        drawHorizontalLine(15, 16, 23, rosa);
        drawHorizontalLine(7, 9, 8, Color.pink);
        drawHorizontalLine(6, 9, 9, Color.pink);
        drawHorizontalLine(3, 9, 10, Color.pink);
        putPixel(6, 10, moño);
        putPixel(5, 8, Color.white);
        drawHorizontalLine(3, 6, 11, Color.pink);
        drawHorizontalLine(3, 5, 12, Color.pink);
        drawHorizontalLine(8, 15, 14, Color.white);
        drawHorizontalLine(7, 16, 15, Color.white);
        drawHorizontalLine(6, 17, 16, Color.white);
        drawHorizontalLine(6, 17, 17, Color.white);
        drawHorizontalLine(6, 17, 18, Color.white);
        drawHorizontalLine(6, 17, 19, Color.white);
        drawHorizontalLine(7, 16, 20, Color.white);
        drawHorizontalLine(11, 12, 22, Color.white);
        drawHorizontalLine(10, 13, 23, Color.white);
        drawHorizontalLine(9, 14, 24, Color.white);
        drawHorizontalLine(7, 16, 25, Color.white);
        drawHorizontalLine(7, 16, 26, Color.white);
        drawHorizontalLine(7, 16, 27, Color.white);
        drawHorizontalLine(7, 9, 28, Color.white);
        drawHorizontalLine(14, 16, 28, Color.white);
        putPixel(5, 23, Color.white);
        putPixel(18, 23, Color.white);
        drawHorizontalLine(4, 5, 24, Color.white);
        drawHorizontalLine(18, 19, 24, Color.white);
        drawHorizontalLine(4, 5, 25, Color.white);
        drawHorizontalLine(18, 19, 25, Color.white);
        drawHorizontalLine(7, 8, 16, Color.black);
        drawHorizontalLine(7, 8, 17, Color.black);
        drawHorizontalLine(7, 8, 18, Color.black);
        drawHorizontalLine(15, 16, 16, Color.black);
        drawHorizontalLine(15, 16, 17, Color.black);
        drawHorizontalLine(15, 16, 18, Color.black);
        drawHorizontalLine(11, 12, 18, Color.yellow);
        drawHorizontalLine(6, 7, 19, Color.pink);
        drawHorizontalLine(16, 17, 19, Color.pink);
        
        drawSquareGrid(PIXEL_SIZE, Color.black);
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("pixel_art.jpg"));
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
