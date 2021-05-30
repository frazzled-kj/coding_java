public Screen(int width, int height) {
	numCols = width;
	data  = new ArrayList<int>[height];
	for (i = 0; i < height, i++) {
		data[i] = new Arraylist<int>;
	}
}

public Pixel pixelAt(int row, int col) {
	ArrayList<int> r = data[row];
	for (i = 0, i < r.size(), i++) {
		Pixel pixel = r.get(i);
		if (pixel.getCol == col) {
			return pixel;
		}
	}
	return null;
}

public void pixelOn(int row, int col) {
	Pixel newPixel = new Pixel(row, col)
	Pixel pixel;
	ArrayList<Pixel> r  = data[row];
	int index = 0;
	for (i = 0; i < data[row].size(), i++) {
		if (col > data[row].get(k).getCol())  {
			index++;
		}
	}
	data[row].add(index, pixel);
}