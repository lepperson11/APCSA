public class PictureTester
{
	public static void testZeroRed()
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroRed();
		beach.explore();
	}
	public static void testZeroGreen()
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroGreen();
		beach.explore();
	}
	public static void testZeroBlue()
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}
	public static void testKeepOnlyRed()
	{
		Picture trump = new Picture("beach.jpg");
		trump.explore();
		trump.keepOnlyRed();
		trump.explore();
	}
	public static void testKeepOnlyGreen()
	{
		Picture trump = new Picture("beach.jpg");
		trump.explore();
		trump.keepOnlyGreen();
		trump.explore();
	}
	public static void testKeepOnlyBlue()
	{
		Picture trump = new Picture("beach.jpg");
		trump.explore();
		trump.keepOnlyBlue();
		trump.explore();
	}
	public static void testNegate()
	{
		Picture trump = new Picture("beach.jpg");
		trump.explore();
		trump.negate();
		trump.explore();
	}
	public static void testGrayscale()
	{
		Picture trump = new Picture("beach.jpg");
		trump.explore();
		trump.grayscale();
		trump.explore();
	}
	public static void testFixUnderwater()
	{
		Picture water = new Picture("water.jpg");
		water.explore();
		water.fixUnderwater();
		water.explore();
	}
	public static void testMirrorVertical()
	{
		Picture trump = new Picture("beach.jpg");
		trump.explore();
		trump.mirrorVertical();
		trump.explore();
	}
	public static void testMirrorVerticalRightToLeft()
	{
		Picture caterpillar = new Picture("caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorVerticalRightToLeft();
		caterpillar.explore();
	}
	public static void testMirrorHorizontal()
	{
		Picture motorcycle = new Picture("redMotorcycle.jpg");
		motorcycle.explore();
		motorcycle.mirrorHorizontal();
		motorcycle.explore();
	}
	public static void testMirrorHorizontalBotToTop()
	{
		Picture motorcycle = new Picture("redMotorcycle.jpg");
		motorcycle.explore();
		motorcycle.mirrorHorizontalBotToTop();
		motorcycle.explore();
	}
	public static void testMirrorDiagonal()
	{
		Picture trump = new Picture("beach.jpg");
		trump.explore();
		trump.mirrorDiagonal();
		trump.explore();
	}
	public static void testMirrorTemple()
	{
		Picture temple = new Picture("temple.jpg");
		temple.explore();
		temple.mirrorTemple();
		temple.explore();
	}
	public static void testMirrorArms()
	{
		Picture snowman = new Picture("snowman.jpg");
		snowman.explore();
		snowman.mirrorArms();
		snowman.explore();
	}
	public static void testMirrorGull()
	{
		Picture gull = new Picture("seagull.jpg");
		gull.explore();
		gull.mirrorGull();
		gull.explore();
	}
	public static void testCollage()
	{
		Picture canvas = new Picture("640x480.jpg");
		canvas.createCollage();
		canvas.explore();
	}
	public static void testCopy()
	{
		Picture trump = new Picture("beach.jpg");
		Picture motorcycle = new Picture("redMotorcycle.jpg");
		trump.explore();
		trump.copy(motorcycle, 30, 100, 150, 300, 250, 400);
		trump.explore();
	}
	public static void testMyCollage()
	{
		Picture canvas = new Picture("640x480.jpg");
		canvas.myCollage();
		canvas.explore();
	}
	public static void testEdgeDetection()
	{
		Picture swan = new Picture("swan.jpg");
		swan.edgeDetection(10);
		swan.explore();
	}
	public static void testEncodeAndDecode()
	{
		Picture trump1 = new Picture("swan.jpg");
		Picture message = new Picture("msgs.jpg");
		trump1.write("H:/images/smsgs.jpg");
		message.write("H:/images/swan.jpg");
		trump1.explore();
		message.explore();
		trump1.encode(message);
		trump1.explore();
		Picture newMessage = trump1.decode();
		newMessage.explore();
		trump1.write("H:/images/msgs.jpg");
		newMessage.write("H:/images/swan.jpg");
		Picture trump2 = new Picture("beach.jpg");
		Picture apple = new Picture("messagelol.png");
		trump2.write("H:/images/msgs.jpg");
		apple.write("H:/images/swan.jpg");
		trump2.explore();
		apple.explore();
		trump2.encode(apple);
		trump2.explore();
		Picture newApple = trump2.decode();
		newApple.explore();
		trump2.write("H:/images/msgs.jpg");
		newApple.write("H:/images/swan.jpg");
	}

	/** Main method for testing.  Every class can have a main
	 * method in Java */
	public static void main(String[] args)
	{
		// uncomment a call here to run a test
		// and comment out the ones you don't want
		// to run
		//testZeroRed();
		//testZeroGreen();
		//testZeroBlue();
		//testKeepOnlyRed();
		//testKeepOnlyGreen();
		//testKeepOnlyBlue();
		//testNegate();
		//testGrayscale();
		//testFixUnderwater();
		//testMirrorVertical();
		//testMirrorVerticalRightToLeft();
		//testMirrorHorizontal();
		//testMirrorHorizontalBotToTop();
		//testMirrorDiagonal();
		//testMirrorTemple();
		//testMirrorArms();
		//testMirrorGull();
		//testCollage();
		//testCopy();
		//testMyCollage();
		//testEdgeDetection();
		testEncodeAndDecode();
		//testEdgeDetection2();
		//testChromakey();
		//testGetCountRedOverValue(250);
		//testSetRedToHalfValueInTopHalf();
		//testClearBlueOverValue(200);
		//testGetAverageForColumn(0);
	}
}