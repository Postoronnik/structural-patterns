package composite.parcel;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ParcelValue implements Parcel{
    private int value;

    @Override
    public void printParcelValue() {
        System.out.println(value);
    }
}
