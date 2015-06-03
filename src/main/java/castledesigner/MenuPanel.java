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

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
//import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;
//import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;
//import javax.swing.border.TitledBorder;

/**
 *
 * @author David Green
 */
public class MenuPanel extends JPanel
{
	public static JLabel coordinatesStr;
    
        public MenuPanel()
	{
		setLayout(new BorderLayout());
                
                final JPopupMenu  fileMenu = new JPopupMenu ("File");

		fileMenu.add(Editor.createOpenMenuItem());
		fileMenu.add(Editor.createSaveMenuItem());
		fileMenu.add(Editor.createSaveAsMenuItem());
		fileMenu.add(new JPopupMenu.Separator());
		fileMenu.add(Editor.createExportMenuItem());
		fileMenu.add(Editor.createImportMenuItem());
                fileMenu.add(new JPopupMenu.Separator());
		fileMenu.add(Editor.createExitMenuItem());
                
                final JPopupMenu  toolsMenu = new JPopupMenu ("File");

		toolsMenu.add(Editor.createAllMoatMenuItem());
                toolsMenu.add(Editor.createStonePerimeterMenuItem());
                toolsMenu.add(new JPopupMenu.Separator());
                toolsMenu.add(Editor.createClearMenuItem());
                
                final JPopupMenu helpMenu = new JPopupMenu("Help");
                helpMenu.add(Editor.createAboutMenuItem());
                helpMenu.add(Editor.createTipsMenuItem());        
                
                JPanel menuPanel = new JPanel(new GridLayout(1, 4));
                menuPanel.setBorder(new EmptyBorder(4, 4, 4, 4));
                
                final JButton menuButton = new JButton("Menu");
                menuButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ev) {
                        fileMenu.show(menuButton, (menuButton.getBounds().x 
                                - menuButton.getBounds().width
                                ), menuButton.getBounds().y + menuButton.getBounds().height);
                    }
                });
                final JButton toolsButton = new JButton("Tools");
                toolsButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ev) {
                        toolsMenu.show(toolsButton, (toolsButton.getBounds().x 
                                - toolsButton.getBounds().width
                                ), toolsButton.getBounds().y + toolsButton.getBounds().height);
                    }
                });
                final JButton helpButton = new JButton("Help");
                helpButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ev) {
                        helpMenu.show(helpButton, (helpButton.getBounds().x
                                - helpButton.getBounds().width
                                ), helpButton.getBounds().y + helpButton.getBounds().height);
                    }
                });
                
                coordinatesStr = new JLabel("",SwingConstants.CENTER);
                
                menuPanel.add(coordinatesStr);
                menuPanel.add(menuButton);
                menuPanel.add(toolsButton);
                menuPanel.add(helpButton);
                
                add(menuPanel, BorderLayout.CENTER);
                
                //setLayout(new GridLayout(2, 1));
		//setBorder(new TitledBorder("Tips!"));
		//add(new JLabel("<html>&bull; Drag the mouse for faster placement of buildings</html>"));
		//add(new JLabel("<html>&bull; Use the right mouse button to delete</html>"));

		//setMaximumSize(new Dimension(getMaximumSize().width, getMinimumSize().height));
                this.setMaximumSize(new Dimension(300, 35));
		this.setMinimumSize(new Dimension(300, 35));
		this.setPreferredSize(new Dimension(300, 35));
                
                this.repaint();
        }
        
        
}