package io.github.geetransit.template;

import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("template.Main#main");
		Other.main(args);
		InputStream file = Main.class.getResourceAsStream("/res/resource.txt");
		Scanner bob = new Scanner(file);
		while (bob.hasNextLine())
			System.out.println(bob.nextLine());
	}
}
