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

import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author David Green
 */
public class AllMoat extends JDialog
{
//	public static final String PROJECT_URL_TEXT = "http://code.google.com/p/stronghold-kingdoms-castle-designer/";
	
	private JButton allMoatButton;
        private JButton deleteMoatButton;
        private JLabel tip1;
	private JLabel tip2;
	
	public AllMoat(Frame owner)
	{
		super(owner);

		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

		allMoatButton = new JButton("All Moat");
		allMoatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
                                Editor.all_Moat();
				dispose();
			}
		});
                
                deleteMoatButton = new JButton("Delete all Moat");
		deleteMoatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
                                Editor.delete_all_Moat();
				dispose();
			}
		});

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);

		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);

		layout.setHorizontalGroup(
			layout.createSequentialGroup()
			.addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				
				.addComponent(allMoatButton)
                                .addComponent(deleteMoatButton)
				)
		);
		layout.setVerticalGroup(
			layout.createSequentialGroup()
				.addComponent(allMoatButton)
                                .addComponent(deleteMoatButton)
		);
		pack();

		getRootPane().setDefaultButton(allMoatButton);
	}
}