# Introduction of example package

## Project

To build __Docker image__. First should create a _project_

A _project_ is just like _Java_ project in workspace

Generally, _project_ identify build task:

* Docker build context

For example, `docker build -t <registry>/<account>/<repo>:<tag> /build/context/path`

it identify a build context: _/build/context/path_, and must exist _Dockerfile_ in context

also it identify output destination: _<registry>/<account>/<repo>:<tag>_

* Github Dockerfile repo

* Source Image

### Model

		<dependency>
			<groupId>io.fabric8</groupId>
			<artifactId>kubernetes-model</artifactId>
			<version>1.0.52</version>
		</dependency>

### Create Project example

### Find Project example

App.java


 

 