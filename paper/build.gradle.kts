plugins {
	id("io.papermc.paperweight.userdev") version "1.3.8"
	id("com.github.johnrengelman.shadow") version "7.1.0"
}

dependencies {
	paperDevBundle("1.18.1-R0.1-SNAPSHOT")

	compileOnly("net.civmc.civmodcore:CivModCore:2.4.0:dev-all")
	compileOnly("net.civmc.namelayer:NameLayer:3.1.0:dev")

    implementation("com.github.seancfoley:ipaddress:2.0.2")
    implementation("org.jsoup:jsoup:1.13.1")
}
