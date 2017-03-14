class Parcel {
  public int mWidth;
  public int mHeight;
  public int mDepth;
  public int mWeight;

  public Parcel(int width, int height, int depth, int weight) {
    mWidth = width;
    mHeight = height;
    mDepth = depth;
    mWeight = weight;
  }

  public int volume() {
    return mWidth * mHeight * mDepth;
  }

  public int surfaceArea() {
    return (mWidth * mHeight * 2) + (mWidth * mDepth * 2) + (mDepth * mHeight * 2);
  }

  public double costToWrap() {
    return surfaceArea() * .1;
  }

  public int costToShip(String speed, int distance) {
    int price;
    if (speed.equals("slow")) {
      price = distance * mWeight * volume();
    } else if (speed.equals("fast")) {
      price = 2 * distance * mWeight * volume();
    } else {
      price = 0;
    }
    return price;
  }
}
