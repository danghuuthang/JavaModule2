package Resizeable;

import Geomegic.Square;

public class ResizealbeSquare extends Square implements Resizeable {
    public ResizealbeSquare(double side){
        super(side);
    }

    @Override
    public void resize(int percent) {
      double side = super.getSide() * percent;
      super.setSide(side);

    }
}
