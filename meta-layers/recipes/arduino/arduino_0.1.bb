DESCRIPTION = "Executes make for building Arduino Uno binaries"
PR = "r1"
do_build () {
  echo "Starting..."
  local sourceRepoName="arduino_src"
  export BOARD=uno
  rm -rf ${TOPDIR}/${sourceRepoName} | true
  git clone https://github.com/dsanti5/arduino_src.git
  export ARDUINODIR=${TOPDIR}/${sourceRepoName}
  cd ${TOPDIR}/${sourceRepoName}/blink
  local makefile=${TOPDIR}/${sourceRepoName}/Makefile
  make -f ${makefile}
  echo "Done!"
}
