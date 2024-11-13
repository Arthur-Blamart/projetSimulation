# ------ Main class ------
MAIN = Main

# ------ Compiler & Runner ------
CC = javac
RUNNER = java

# ------ Directories ------

SOURCE_DIR = src
CLASSES_DIR = classes
BIN_DIR = bin

# ------ Lists ------
SRC_LIST = $(shell find src/ -name "*.java")
CLASS_LIST = ${SRC_LIST:$(SOURCE_DIR)/%.java=$(CLASSES_DIR)/%.class}

# ======== Rules ========

.PHONY : all
all : $(CLASS_LIST)

.PHONY : prout
prout : 
	@echo $(CLASS_LIST)

# ------ Compiling ------
classes/%.class : src/%.java
	@$(CC) -d ./$(CLASSES_DIR) -cp ./$(CLASSES_DIR) -sourcepath ./$(SOURCE_DIR) $<

# ------ running ------
.PHONY : run
run :
	@$(RUNNER) -cp $(CLASSES_DIR) $(MAIN) 100

# ------ Workspace initialisation ------
.PHONY : init
init :
	@echo "Creating workspace"
	@mkdir $(SOURCE_DIR);mkdir $(CLASSES_DIR);mkdir $(BIN_DIR)

# ------ Workspace cleaning (classes) ------

.PHONY : clean
clean :
	@rm -rf $(CLASSES_DIR)/*
