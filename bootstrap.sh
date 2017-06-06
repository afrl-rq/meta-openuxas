# NOTE: this file is meant to be `source`d from the poky root, not run!
# e.g.,
# $ source meta-openuxas/bootstrap.sh

source oe-init-build-env
bitbake-layers add-layer ../meta-odroid
bitbake-layers add-layer ../meta-openembedded/meta-oe
bitbake-layers add-layer ../meta-openembedded/meta-python
bitbake-layers add-layer ../meta-openuxas

echo "Now add \`MACHINE ??= \"odroid-xu4\" to conf/local.conf\` and then \
run \`bitbake core-image-openuxas\`"
