package flyweight.flyweight_object;


public class SomeBigObject {
    private SmallPartOfBigObject nonChangeableObject;
    private int data1;
    private int data2;
    private int data3;
    private int data4;

    public int eachObjectSizeIfLinkIsTheSame = 4 * 4;
    public int linkSize = 2 * 4;
}
