package com.upa.server;
import com.upa.server.enumeration.Status;
import com.upa.server.model.Server;
import com.upa.server.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepo serverRepo) {
		return args -> {
			serverRepo.save(new Server(null, "192.168.125.23", "Ubuntu Linux", "16 GB", "Personal PC", "http://localhost:8080/server/image/server1.png", Status.SERVER_UP));
			serverRepo.save(new Server(null, "10.23.144.23", "Debian Linux", "16 GB", "Personal PC", "http://localhost:8080/server/image/server2.png", Status.SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.2", "Windows", "16 GB", "Personal PC", "http://localhost:8080/server/image/server3.png", Status.SERVER_UP));
			serverRepo.save(new Server(null, "192.168.3.2", "Fedora", "16 GB", "Personal PC", "http://localhost:8080/server/image/server4.png", Status.SERVER_UP));

		};
	}

}
