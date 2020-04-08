SUMMARY = "Qt5 ScreenyPi App"
HOMEPAGE = "http://www.soualigatech.fr"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
DEPENDS += "qtbase libnavajo"

PR = "r4"

SRCREV = "${AUTOREV}"
SRC_URI = "git://git@github.com/damien-chagnaud/screenypi.git" 

S = "${WORKDIR}/git"

require recipes-qt/qt5/qt5.inc

do_install() {
#Verify /usr/bin path and copy app to this.
    install -d ${D}${bindir}
    install -m 0755 ${B}/screenypi ${D}${bindir}
#Verify /etc/init.d and rc* path:
    install -d ${D}${sysconfdir}/init.d
    install -d ${D}${sysconfdir}/rcS.d
    install -d ${D}${sysconfdir}/rc1.d
    install -d ${D}${sysconfdir}/rc2.d
    install -d ${D}${sysconfdir}/rc3.d
    install -d ${D}${sysconfdir}/rc4.d
    install -d ${D}${sysconfdir}/rc5.d
#Copy the run script into /etc/init.d:
    install -m 0755 ${WORKDIR}/screenypi  ${D}${sysconfdir}/init.d/
#link to rc* directory:
    ln -sf ../init.d/screenypi      ${D}${sysconfdir}/rc1.d/K90screenypi
    ln -sf ../init.d/screenypi      ${D}${sysconfdir}/rc2.d/K90screenypi
    ln -sf ../init.d/screenypi      ${D}${sysconfdir}/rc3.d/K90screenypi
    ln -sf ../init.d/screenypi      ${D}${sysconfdir}/rc4.d/K90screenypi
    ln -sf ../init.d/screenypi      ${D}${sysconfdir}/rc5.d/S90screenypi
}

FILES_${PN} = "${bindir}"

RDEPENDS_${PN} = "qtbase-plugins"
