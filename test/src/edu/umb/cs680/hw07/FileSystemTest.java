package edu.umb.cs680.hw07;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FileSystemTest {

	@Test
	public void verifyRootDirectoryNameEquality() {
		FileSystem fs = FileSystem.getFileSystem();
		Directory root = new Directory(null, "root", 0, LocalDateTime.now()); 
		fs.appendRootDir(root);
		Object expected = "root";
		Object actual = root.getName();
		assertEquals(expected, actual);
	}
}