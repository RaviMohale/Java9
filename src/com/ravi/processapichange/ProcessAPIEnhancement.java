package com.ravi.processapichange;

import java.io.IOException;
import java.util.Optional;
import java.util.stream.Stream;

public class ProcessAPIEnhancement {

	public static void main(String[] args) throws IOException {
		
		
		Optional<ProcessHandle> op = ProcessHandle.of(5828); // pid from taskManager
		if(op.isPresent()) {
			ProcessHandle pr = op.get();
			System.out.println(pr.info().user());
			System.out.println(pr.isAlive());
			System.out.println(pr.info().startInstant().get());
			System.out.println(pr.info().totalCpuDuration().get());
			pr.destroy();
			System.out.println(pr.isAlive());
		}
			Stream<ProcessHandle> prStream = ProcessHandle.allProcesses();
				prStream.forEach(p-> {
					if(p.isAlive()) 
						System.out.println(" PID "+ p.pid() +" info " + p.info()+ " User is "+ p.info().user());
					
				});
				
				
				// with  the help of processBuilder we can start the process.
			Process p1 = new ProcessBuilder("notepad.exe").start();
			// with the help of processBuilder we can start the eclipse
			Process p2 = new ProcessBuilder("C:\\Users\\Ravi\\eclipse\\java-2023-09\\eclipse\\eclipse.exe").start();
		}
	
}
