/*
 * Copyright (c) 2012 David Green
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package castledesigner;

import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * Wrapper class for LandGrid
 *
 * @author David Green
 */
public class LandPanel extends JPanel
{
	private LandGrid landGrid;

	public LandPanel()
	{
		JScrollPane scrollPane = new javax.swing.JScrollPane();
		landGrid = new LandGrid();

		scrollPane.setViewportView(landGrid);
		scrollPane.setPreferredSize(landGrid.getMinimumSize());

		this.add(scrollPane);
	}
	
	public LandGrid getLandGrid()
	{
		return landGrid;
	}

	public BufferedImage getDesignImage()
	{
		BufferedImage image = new BufferedImage(landGrid.getWidth(), landGrid.getHeight(), BufferedImage.TYPE_INT_ARGB);
		landGrid.paint(image.createGraphics());

		return image;
	}
}