package composite.start.point;

import composite.parcel.CompositeParcel;
import composite.parcel.ParcelValue;

public class Main {
    public static void main(String[] args) {
        CompositeParcel mainParcel = new CompositeParcel();

        mainParcel.addElement(new ParcelValue(1));

        CompositeParcel childParcel = new CompositeParcel();
        childParcel.addElement(new ParcelValue(2));
        childParcel.addElement(new ParcelValue(3));

        mainParcel.addElement(childParcel);

        mainParcel.printParcelValue();
    }
}
