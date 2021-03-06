package Unit16;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test keepOnlyBlue */
  public static void testKeepOnlyBlue(){
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.keepOnlyBlue();
	  beach.explore();
  }
  
  /** Method to test negate */
  public static void testNegate(){
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.negate();
	  beach.explore();
  }
  
  /** Method to test greyscale */
  public static void testGrayscale(){
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.grayscale();
	  beach.explore();
  }
  
  /** Method to test fixUnderwater */
  public static void testFixUnderwater(){
	  Picture water = new Picture("water.jpg");
	  water.explore();
	  water.fixUnderwater();
	  water.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorVerticalRightToLeft */
  public static void testMirrorVerticalRightToLeft(){
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.mirrorVerticalRightToLeft();
	  beach.explore();
  }
  
  /** Method to test mirrorHorizontally */
  public static void testMirrorHorizontally(){
	  Picture caterpillar = new Picture("caterpillar.jpg");
	  caterpillar.explore();
	  caterpillar.mirrorHorizontally();
	  caterpillar.explore();
  }
  
  /** Method to test mirrorHorizontallyBotToTop */
  public static void testMirrorHorizontallyBotToTop(){
	  Picture caterpillar = new Picture("caterpillar.jpg");
	  caterpillar.explore();
	  caterpillar.mirrorHorizontallyBotToTop();
	  caterpillar.explore();
  }
  
  /** Method to test mirrorDiagonally */
  public static void testMirrorDiagonally(){
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.mirrorDiagonaly();
	  beach.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test mirrorArms */
  public static void testMirrorArms() {
	  Picture snowman = new Picture("snowman.jpg");
	  snowman.explore();
	  snowman.mirrorArms();
	  snowman.explore();
  }
  
  /** Method to test mirrorGull */
  public static void testMirrorGull() {
	  Picture gull = new Picture("seagull.jpg");
	  gull.explore();
	  gull.mirrorGull();
	  gull.explore();
  }
  
  public static void testCopy() {
	  Picture beach = new Picture("beach.jpg");
	  Picture snowman = new Picture("snowman.jpg");
	  beach.explore();
	  beach.copy(snowman, 20, 40);
	  beach.explore();
  }
  
  public static void testCopy2() {
	  Picture beach = new Picture("beach.jpg");
	  Picture snowman = new Picture("snowman.jpg");
	  beach.explore();
	  beach.copy2(snowman, 20, 40, 100, 230, 200, 300);
	  beach.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture beach = new Picture("beach.jpg");
    beach.createCollage();
    beach.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testBlur(){
	  Picture butterfly = new Picture("KatieFancy.jpg");
	  butterfly.explore();
	  butterfly.blur(20, 20, 100, 100);
	  butterfly.blur(20, 20, 100, 100);
	  butterfly.blur(20, 20, 100, 100);
	  butterfly.blur(20, 20, 100, 100);
	  butterfly.blur(20, 20, 100, 100);
	  butterfly.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontally();
	//testMirrorHorizontallyBotToTop();
	//testMirrorDiagonally();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
	//testCopy2();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	testBlur();
  }
}