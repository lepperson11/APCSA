
public class PictureTester
{
 /** Method to test zeroBlue */
 public static void testZeroBlue()
 {
   Picture beach = new Picture(getSimplePathFromLead("beach.jpg"));
   beach.explore();
   beach.zeroBlue();
   beach.explore();
 }


 /** Method to test mirrorVertical */
 public static void testMirrorVertical()
 {
   Picture caterpillar = new Picture(getSimplePathFromLead("caterpillar.jpg"));
   caterpillar.explore();
   caterpillar.mirrorVertical();
   caterpillar.explore();
 }


 /** Method to test mirrorTemple */
 public static void testMirrorTemple()
 {
   Picture temple = new Picture(getSimplePathFromLead("temple.jpg"));
   temple.explore();
   temple.mirrorTemple();
   temple.explore();
 }


 /** Method to test the collage method */
 public static void testCollage()
 {
   Picture canvas = new Picture(getSimplePathFromLead("640x480.jpg"));
   canvas.createCollage();
   canvas.explore();
 }


 /** Method to test edgeDetection */
 public static void testEdgeDetection()
 {
   Picture swan = new Picture(getSimplePathFromLead("swan.jpg"));
   swan.edgeDetection(10);
   swan.explore();
 }
 public static void testKeepOnlyBlue() {
	  Picture picture = new Picture(getSimplePathFromLead("beach.jpg"));
	  picture.setBlue();
	  picture.explore();
 }
 public static void testKeepOnlyGreen() {
	  Picture picture = new Picture(getSimplePathFromLead("beach.jpg"));
	  picture.setGreen();
	  picture.explore();
 }
 public static void testKeepOnlyRed() {
	  Picture picture = new Picture(getSimplePathFromLead("beach.jpg"));
	  picture.setRed();
	  picture.explore();
 }
 public static void testNegate() {
	  Picture picture = new Picture(getSimplePathFromLead("butterfly1.jpg"));
	  picture.negate();
	  picture.explore();
 }
 public static void testGrayscale() {
	  Picture picture = new Picture(getSimplePathFromLead("beach.jpg"));
	  picture.grayscale();
	  picture.explore();
 }
 public static void testFixUnderwater() {
	  Picture picture = new Picture(getSimplePathFromLead("water.jpg"));
	  picture.fixUnderwater();
	  picture.explore();
 }
 public static void testMirrorVerticalRightToLeft() {
	  Picture picture = new Picture(getSimplePathFromLead("redMotorcycle.jpg"));
	  picture.mirrorRightToLeft();
	  picture.explore();
 }
 public static void testMirrorHorizontal() {
	  Picture picture = new Picture(getSimplePathFromLead("redMotorcycle.jpg"));
	  picture.mirrorHorizontal();
	  picture.explore();
 }
 public static void testMirrorBotToTop() {
	  Picture picture = new Picture(getSimplePathFromLead("redMotorcycle.jpg"));
	  picture.mirrorHorizontalBotToTop();
	  picture.explore();
 }
 public static void testMirrorDiagonal() {
	  Picture picture = new Picture(getSimplePathFromLead("beach.jpg"));
	  picture.mirrorDiagonal();
	  picture.explore();
 }
 public static void testBlur(int x, int y, int w, int h, int n)
 {
    Picture redMoto = new Picture(getSimplePathFromLead("beach.jpg"));
    for (int i = 0; i<n; i++){
       redMoto.blur(x,y,w,h);
     }
     redMoto.explore();
 }


 /** Main method for testing.  Every class can have a main
   * method in Java */
 public static void main(String[] args)
 {
   // uncomment a call here to run a test
   // and comment out the ones you don't want
   // to run
	 testBlur(190,160,20,20,5);
   // testZeroBlue();
   //testKeepOnlyBlue();
   //testKeepOnlyRed();
   //testKeepOnlyGreen();
   //testNegate();
   //testGrayscale();
   //testFixUnderwater();
   //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
   //testMirrorTemple();
   //testMirrorArms();
   //testMirrorGull();
   //testMirrorDiagonal();
   //testCollage();
   //testCopy();
   //testEdgeDetection();
   //testEdgeDetection2();
   //testChromakey();
   //testEncodeAndDecode();
   //testGetCountRedOverValue(250);
   //testSetRedToHalfValueInTopHalf();
   //testClearBlueOverValue(200);
   //testGetAverageForColumn(0);
 }






public static String getSimplePathFromLead(String fileName) {
	  return "/Users/eppersonl1493/Desktop/APCSA/Unit16/pixLab/images/" + fileName;
 }
}
