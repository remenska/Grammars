#include <stdio.h>
#include <dparse.h>
#include <string.h>
#include <sys/stat.h>
extern D_ParserTables parser_tables_gram;

char* read_entire_file(const char* filename);

int main(int argc, char *argv[]) {
  char* s = read_entire_file(argv[1]);
  
  D_Parser *p = new_D_Parser(&parser_tables_gram, 0);
  D_ParseNode *tree = dparse(p, s, strlen(s));
  if (tree && !p->syntax_errors) {
    printf("success\n");
  } else {
    printf("failure\n");
  }

  return 0;
}

char* read_entire_file(const char* filename) {
  struct stat st;
  stat(filename, &st);
  int size = st.st_size;

  char* s = (char*)malloc((size + 1)*sizeof(char));
  FILE* fd = fopen(filename, "r");
  int i = 0;
  while ((s[i++] = fgetc(fd)) != EOF);
  s[i - 1] = ' '; 
  return s;
}