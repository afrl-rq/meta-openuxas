SUMMARY = "OpenUxAS"
LICENSE = "USAF-OSA"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=faf9536cec7d071d822258c9d270bb0e"
SRC_URI = "git://git@github.com/afrl-rq/OpenUxAS.git;protocol=ssh;branch=galois-teas-cross"

PV = "1.0.0+git${SRCPV}"
SRCREV = "4f1063557d189ac362eba0cdf2de5d8ef4af0a93"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"

export BOOST_ROOT
BOOST_ROOT="${WORKDIR}/recipe-sysroot/usr"

export SSL_CERT_FILE
SSL_CERT_FILE="${WORKDIR}/recipe-sysroot/usr/lib/python3.5/site-packages/certifi/cacert.pem"

inherit meson

DEPENDS = "boost libglu python3-certifi"

addtask prepare before do_configure
do_prepare() {
  (cd ${S}; python3 prepare)
}