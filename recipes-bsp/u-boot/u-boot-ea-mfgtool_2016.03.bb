require u-boot-ea_${PV}.bb
require recipes-bsp/u-boot/u-boot-mfgtool.inc

SRCBRANCH = "ea_v2016.03_4.1.15_2.0.0"
SRC_URI = "git://github.com/jameelkareem-ea/uboot-imx.git;branch=${SRCBRANCH} \
           "
SRCREV = "1e60c79043fccbf463300777d205ab1ce24c778f"
