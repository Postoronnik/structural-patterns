package composite.parcel;

import java.util.ArrayList;
import java.util.List;

public class CompositeParcel implements Parcel{

    private List<Parcel> childParcels = new ArrayList<>();

    public void addElement(Parcel parcel){
        childParcels.add(parcel);
    }

    public void removeElement(Parcel parcel){
        childParcels.remove(parcel);
    }

    @Override
    public void printParcelValue() {
        childParcels.forEach(Parcel::printParcelValue);
    }
}
