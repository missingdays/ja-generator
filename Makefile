
build:
	kotlinc src/*.kt -cp json.jar -include-runtime -d ja-generator.jar
	cp ja-generator.jar ../ja-grid
