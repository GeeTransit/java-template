/*
George Zhang
June 4, 2020
Assignment: App launcher.
ICS 3U7-02 Ms. Strelkovska
Source # http://www.jdotsoft.com/JarClassLoader.php
*/

// note the absence of a package

import com.jdotsoft.jarloader.JarClassLoader;

public class Launcher {
	public static final String invoke = "io.github.geetransit.template.Main";
	public static void main(String[] args) throws Throwable {
		new JarClassLoader().invokeMain(invoke, args);
	}
}
