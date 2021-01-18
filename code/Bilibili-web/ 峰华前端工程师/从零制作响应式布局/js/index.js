/* 选择目标作为轮播组件 */
const glide = new Glide(".glide");


const captionsEL = document.querySelectorAll(".slide-caption");
glide.on(["mount.after", "run.after"], () => {
    const caption = captionsEL[glide.index]; // 获取实例
    anime({
        targets: caption.children,
        opacity: [0, 1],
        duration: 400,
        easing: "linear",
        delay: anime.stagger(400, { start: 300 }),
        /* 会对每一项添加延迟 */
        translateY: [anime.stagger([40, 10]), 0]
    })
})

glide.on("run.before", () => {
    document.querySelectorAll(".slide-caption > *").forEach(el => {
        el.style.opacity = 0;
    })
})

glide.mount();